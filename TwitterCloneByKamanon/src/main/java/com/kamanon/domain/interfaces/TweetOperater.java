package com.kamanon.domain.interfaces;

/**
 * Tweetに対する各種操作を定義
 */
public interface TweetOperater {

	public int insertTweet(Long userId, String tweetText);
	
	public int deleteTweet(Long userId, Long tweetId);
}
