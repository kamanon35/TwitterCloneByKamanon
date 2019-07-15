package com.kamanon.domain.service.tweet;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kamanon.domain.interfaces.TweetOperater;
import com.kamanon.domain.model.mybatis.custom.entity.TweetInfoEntity;
import com.kamanon.domain.model.mybatis.custom.mapper.TweetInfoMapper;
import com.kamanon.domain.model.mybatis.entity.TTweet;
import com.kamanon.domain.model.mybatis.mapper.TTweetMapper;
import com.kamanon.utils.KamanonConstants;

/**
 * ツイート関連の操作を実施する
 * */
@Service
public class TweetService implements TweetOperater {

	@Autowired
	TTweetMapper _tTweetMapper;

	@Autowired
	TweetInfoMapper _tweetInfoMapper;

	/**
	 * 新規ツイートを投稿
	 * */
	@Override
	@Transactional
	public int insertTweet(Long userId, String tweetText) {

		TTweet entity = new TTweet();
		entity.setTweetId(_tweetInfoMapper.numberingTweetId());
		entity.setUserId(userId);
		entity.setTweet(tweetText);
		entity.setRetweetFlg(KamanonConstants.RETWEET_FLG_OFF);
		entity.setCreated(LocalDateTime.now());

		return _tTweetMapper.insert(entity);
	}

	/**
	 * ツイートを削除
	 */
	@Override
	@Transactional
	public int deleteTweet(Long userId, Long tweetId) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	/**
	 * 最新ツイート情報を取得
	 * @param userId
	 * 					ユーザーID
	 * */
	public TweetInfoEntity doSelectLatestTweet(Long userId) {
		return _tweetInfoMapper.selectLatestTweet(userId);
	}

}
