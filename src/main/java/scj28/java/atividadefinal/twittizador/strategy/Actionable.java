package scj28.java.atividadefinal.twittizador.strategy;

import scj28.java.atividadefinal.twittizador.vo.TweetVO;
import twitter4j.TwitterException;

public interface Actionable {
	void action(TweetVO tweetVO) throws TwitterException;
}
