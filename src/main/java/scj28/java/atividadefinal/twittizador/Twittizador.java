package scj28.java.atividadefinal.twittizador;

import java.time.LocalDate;

import scj28.java.atividadefinal.twittizador.enumeration.Action;
import scj28.java.atividadefinal.twittizador.enumeration.TipoDeOrdenacao;
import scj28.java.atividadefinal.twittizador.vo.TweetVO;
import twitter4j.TwitterException;

public class Twittizador {

	private TweetVO tweetVO = new TweetVO();

	public Twittizador(String hashTag, LocalDate dataInicio) {
		tweetVO.setHashTag(hashTag).setDataAgora(LocalDate.now()).setDataInicio(dataInicio);
		System.out.printf("Data Inicial - %s | Data Final - %s\n\n", tweetVO.getDataInicio(), tweetVO.getDataAgora());
	}

	public void executeAction(Action action) {
		try {
			action.get().action(tweetVO);
			System.out.println("<===========================================>");
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}

	public void executeAction(Action action, TipoDeOrdenacao type) {
		try {
			tweetVO.setTipoDeOrdenacao(type);
			action.get().action(tweetVO);
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}
}
