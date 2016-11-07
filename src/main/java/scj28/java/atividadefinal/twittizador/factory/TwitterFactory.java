package scj28.java.atividadefinal.twittizador.factory;

import twitter4j.Twitter;
import twitter4j.auth.AccessToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterFactory {

	private static Twitter twitter;
	
	private static void inicialize() {
		Configuration configuration = loadAccessOAuth();
		twitter4j.TwitterFactory factory = new twitter4j.TwitterFactory(configuration);
		AccessToken accessToken = loadAccessToken();
		twitter = factory.getInstance();
		twitter.setOAuthAccessToken(accessToken);
	}
	
	private static Configuration loadAccessOAuth() {
		ConfigurationBuilder builder = new ConfigurationBuilder();
		builder.setOAuthConsumerKey("H6igZQcXslWrNe8mdyibx1kMf");
		builder.setOAuthConsumerSecret("sisk5F1zQhj7sI0KBf2pRhHpy7QIgd7dXT9AcLzVLaCT6VREJU");
		Configuration configuration = builder.build();
		return configuration;
	}

	private static AccessToken loadAccessToken() {
		String token = "287002585-xRO1phMWZwIdtpWQl3K3Lof8nclj2U0Xqcpr5QpN";
		String tokenSecret = "aqJePj0tY5bc1Yv1LNijja2q3ka5nEcWhYo01OD5Yt02y";
		return new AccessToken(token, tokenSecret);
	}
	
	public static Twitter getInstance(){
		if(twitter == null){
			inicialize();
		}
		
		return twitter;
	}
}
