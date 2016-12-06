package scj28.java.atividadefinal.strategy;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import scj28.java.atividadefinal.enumeration.TipoDeOrdenacao;
import scj28.java.atividadefinal.vo.TweetVO;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *  Ação que busca e imprime a os tweets ordenados pelo nome do autor
 *
 */
public class Organizer implements Actionable {

	@Override
	public void action(TweetVO tweetVO) throws TwitterException {
		TipoDeOrdenacao tipoDeOrdenacao = tweetVO.getTipoDeOrdenacao();
		LocalDate dataAnterior = tweetVO.getDataInicio();
		List<Status> tweets = new ArrayList<>();
		
		while (dataAnterior.isBefore(tweetVO.getDataAgora())) {
			tweets.addAll(buscaTweets(tweetVO.getHashTag(), dataAnterior));
			dataAnterior = dataAnterior.plusDays(1);
		}
		
		if (tipoDeOrdenacao.equals(TipoDeOrdenacao.AUTHOR_NAME)) {
			imprimeNomes(tweets);
		}
		if (tipoDeOrdenacao.equals(TipoDeOrdenacao.DATE_TWEET)) {
			imprimeDatas(tweets);
		}
	}

	private void imprimeDatas(List<Status> tweets) {
		List<Date> datas = tweets.stream() //transforma em stream
				  .map(s -> s.getCreatedAt())//reduz para uma lista de nomes
				  .sorted()//ordena os nomes
				  .collect(Collectors.toList());
		
		LocalDateTime maisAntiga = Instant.ofEpochMilli(datas.get(0).getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
		LocalDateTime maisRecente = Instant.ofEpochMilli(datas.get(datas.size()-1).getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm");
		
		System.out.printf("Data mais antiga: %s\n", maisAntiga.format(formatter));
		System.out.printf("Data mais recente: %s\n", maisRecente.format(formatter));
	}


	private void imprimeNomes(List<Status> tweets) {
		List<String> nomes = tweets.stream() //transforma em stream
			  .map(s -> s.getUser().getScreenName().toUpperCase())//reduz para uma lista de nomes
			  .sorted()//ordena os nomes
			  .collect(Collectors.toList());

		System.out.printf("Primeiro Nome: @%s\n", nomes.get(0));
		System.out.printf("Ultimo Nome: @%s\n", nomes.get(nomes.size()-1));
	}

	
	private List<Status> buscaTweets(String hashTag, LocalDate dataInicio) throws TwitterException {
		// Recupera a instancia da classe twitter já autenticada.
		Twitter twitter = TwitterFactory.getSingleton();
		LocalDate dataAnterior = dataInicio.minusDays(1);

		Query query = new Query(hashTag);
		query.setSince(dataAnterior.toString());
		query.setUntil(dataInicio.toString());

		QueryResult result = twitter.search(query);
		List<Status> tweets = new ArrayList<>();
		
		while (result.hasNext()) {
			query = result.nextQuery();
			tweets.addAll(result.getTweets());
			result = twitter.search(query);
		}

		return tweets;
	}
}
