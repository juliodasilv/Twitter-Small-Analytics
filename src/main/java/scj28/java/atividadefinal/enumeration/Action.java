package scj28.java.atividadefinal.enumeration;

import scj28.java.atividadefinal.strategy.Actionable;
import scj28.java.atividadefinal.strategy.Favorite;
import scj28.java.atividadefinal.strategy.Organizer;
import scj28.java.atividadefinal.strategy.Retweet;
import scj28.java.atividadefinal.strategy.Tweet;
import scj28.java.atividadefinal.strategy.Tweeter;

/**
 * Enum que define instancias da classe Actionable
 * que provê a ação em tempo de execução
 */
public enum Action {

	TWEETER(new Tweeter()), 
	COUNT_TWEETS(new Tweet()), 
	COUNT_RETWEETS(new Retweet()), 
	COUNT_FAVORITES(new Favorite()),
	ORDER_BY(new Organizer());
	
	private Actionable contavel;
	
	Action(Actionable contavel) {
		this.contavel = contavel;
	}

	public Actionable get() {
		return contavel;
	}
	
}
