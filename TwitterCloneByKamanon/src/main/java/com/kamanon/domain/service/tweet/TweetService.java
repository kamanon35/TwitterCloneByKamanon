package com.kamanon.domain.service.tweet;

import org.springframework.stereotype.Service;

import com.kamanon.domain.interfaces.TweetOperater;
import com.kamanon.domain.model.mybatis.entity.Usr;

/**
 * ツイート関連の操作を実施する
 * ※クラス設計を学んだ後にインタフェースから設計し直すべき
 * */
@Service
public class TweetService implements TweetOperater {

	@Override
	public Integer addTweet() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Integer deleteTweet() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}



}
