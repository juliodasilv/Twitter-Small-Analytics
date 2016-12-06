package scj28.java.atividadefinal.strategy;

import scj28.java.atividadefinal.vo.TweetVO;
import twitter4j.TwitterException;

/**
 * Interface que define a ação que será executada utilizando o padrão de projetos strategy. 
 */
public interface Actionable {
	void action(TweetVO tweetVO) throws TwitterException;
}
