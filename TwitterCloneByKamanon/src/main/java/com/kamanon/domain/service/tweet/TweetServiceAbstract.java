package com.kamanon.domain.service.tweet;

import org.springframework.transaction.annotation.Transactional;

import com.kamanon.domain.interfaces.TweetOperater;

/**
 * ツイート関連の操作を実施する
 * ※クラス設計を学んだ後にインタフェースから設計し直すべき
 * */
public abstract class TweetServiceAbstract implements TweetOperater {
	
	

	@Transactional
	public abstract Integer insertTweet();
	@Transactional
	public abstract Integer deleteTweet();

}
