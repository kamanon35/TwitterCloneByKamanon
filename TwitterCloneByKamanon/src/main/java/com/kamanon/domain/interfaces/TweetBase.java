package com.kamanon.domain.interfaces;

import com.kamanon.domain.model.mybatis.entity.Usr;

/**
 * Tweetに対する各種操作を定義
 */
public interface TweetBase {

	public Integer addTweet(Usr usr, String tweet);
	
	public Integer deleteTweet(Usr usr, String tweet);
}
