package scj28.java.atividadefinal.twittizador;

import static scj28.java.atividadefinal.twittizador.enumeration.Action.COUNT_FAVORITES;
import static scj28.java.atividadefinal.twittizador.enumeration.Action.COUNT_RETWEETS;
import static scj28.java.atividadefinal.twittizador.enumeration.Action.COUNT_TWEETS;
import static scj28.java.atividadefinal.twittizador.enumeration.Action.ORDER_BY;
import static scj28.java.atividadefinal.twittizador.enumeration.TipoDeOrdenacao.AUTHOR_NAME;
import static scj28.java.atividadefinal.twittizador.enumeration.TipoDeOrdenacao.DATE_TWEET;

import java.time.LocalDate;

public class TwittizadorTestDrive {

	public static void main(String[] args) {
		try {
			// Cria Strategy
			Twittizador twiitizador = new Twittizador("#java8", LocalDate.now().minusWeeks(1));

			// 1. Quantidade por dia de tweets da última semana.
			twiitizador.executeAction(COUNT_TWEETS);

			// 2. Quantidade por dia de retweets da última semana.
			twiitizador.executeAction(COUNT_RETWEETS);

			// 3. Quantidade por dia de favoritações da última semana.
			twiitizador.executeAction(COUNT_FAVORITES);

			// 4. Ordenar os tweets pelo nome do autor, e exibir o primeiro nome
			// e o último nome.
			twiitizador.executeAction(ORDER_BY, AUTHOR_NAME);

			// 5. Ordenar os tweets por data, e exibir a data mais recente e a
			// menos recente.
			twiitizador.executeAction(ORDER_BY, DATE_TWEET);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
