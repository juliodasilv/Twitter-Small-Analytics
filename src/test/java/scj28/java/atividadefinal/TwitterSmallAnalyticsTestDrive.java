package scj28.java.atividadefinal;

import static scj28.java.atividadefinal.enumeration.Action.COUNT_FAVORITES;
import static scj28.java.atividadefinal.enumeration.Action.COUNT_RETWEETS;
import static scj28.java.atividadefinal.enumeration.Action.COUNT_TWEETS;
import static scj28.java.atividadefinal.enumeration.Action.TWEETER;
import static scj28.java.atividadefinal.enumeration.Action.ORDER_BY;
import static scj28.java.atividadefinal.enumeration.TipoDeOrdenacao.AUTHOR_NAME;
import static scj28.java.atividadefinal.enumeration.TipoDeOrdenacao.DATE_TWEET;

/**
 * Classe criada para testar todas as ações do 
 * Twitter Small Analytics.
 * 
 */
public class TwitterSmallAnalyticsTestDrive {

	public static void main(String[] args) {
		try {
			// Cria Strategy
			TwitterSmallAnalytics analytics = new TwitterSmallAnalytics("#java8");

			// 1. Quantidade por dia de tweets da última semana.
			analytics.executeAction(COUNT_TWEETS);

			// 2. Quantidade por dia de retweets da última semana.
			analytics.executeAction(COUNT_RETWEETS);

			// 3. Quantidade por dia de favoritações da última semana.
			analytics.executeAction(COUNT_FAVORITES);

			// 4. Ordenar os tweets pelo nome do autor, e exibir o primeiro nome
			// e o último nome.
			analytics.executeAction(ORDER_BY, AUTHOR_NAME);

			// 5. Ordenar os tweets por data, e exibir a data mais recente e a
			// menos recente.
			analytics.executeAction(ORDER_BY, DATE_TWEET);
			
			// 6. Realiza um tweet referenciando o professor
			analytics.executeAction(TWEETER);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
