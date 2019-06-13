package com.kamanon.domain.service.tweet;

import org.springframework.stereotype.Service;

import com.kamanon.domain.interfaces.TweetBase;
import com.kamanon.domain.model.mybatis.entity.Usr;

/**
 * ツイート関連の操作を実施する
 * */
@Service
public class TweetService implements TweetBase {

	@Override
	public Integer addTweet(Usr usr, String tweet) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Integer deleteTweet(Usr usr, String tweet) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}


}
