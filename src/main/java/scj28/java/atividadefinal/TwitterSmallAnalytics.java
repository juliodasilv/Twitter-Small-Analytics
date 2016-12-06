package scj28.java.atividadefinal;

import java.time.LocalDate;

import scj28.java.atividadefinal.enumeration.Action;
import scj28.java.atividadefinal.enumeration.TipoDeOrdenacao;
import scj28.java.atividadefinal.vo.TweetVO;
import twitter4j.TwitterException;

/**
 * Classe principal do sistma responsavel
 * por executar as consultas a base do twitter
 */
public class TwitterSmallAnalytics {

	private TweetVO tweetVO = new TweetVO();

	/**
	 * O construtor é responsavel por definir por qual tag a busca irá se basear.
	 * 
	 * @param hashTag
	 */
	public TwitterSmallAnalytics(String hashTag) {
		tweetVO.setHashTag(hashTag).setDataAgora(LocalDate.now()).setDataInicio(LocalDate.now().minusWeeks(1));
		System.out.printf("Data Inicial - %s | Data Final - %s\n\n", tweetVO.getDataInicio(), tweetVO.getDataAgora());
	}

	/**
	 * Executa a ação passada como parâmetro
	 * 
	 * @param action
	 */
	public void executeAction(Action action) {
		try {
			action.get().action(tweetVO);
			System.out.println("<===========================================>");
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Executa a ação de forma ordenada de acordo com os parametros passados.
	 * 
	 * @param action
	 * @param type
	 */
	public void executeAction(Action action, TipoDeOrdenacao type) {
		try {
			tweetVO.setTipoDeOrdenacao(type);
			action.get().action(tweetVO);
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}
}
