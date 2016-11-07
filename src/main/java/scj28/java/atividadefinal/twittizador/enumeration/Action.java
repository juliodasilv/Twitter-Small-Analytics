package scj28.java.atividadefinal.twittizador.enumeration;

import scj28.java.atividadefinal.twittizador.strategy.Actionable;
import scj28.java.atividadefinal.twittizador.strategy.Favorite;
import scj28.java.atividadefinal.twittizador.strategy.Organizer;
import scj28.java.atividadefinal.twittizador.strategy.Retweet;
import scj28.java.atividadefinal.twittizador.strategy.Tweet;

public enum Action {

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
