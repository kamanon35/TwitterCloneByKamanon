package com.kamanon.domain.service.tweet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kamanon.domain.model.mybatis.entity.Tweet;
import com.kamanon.domain.model.mybatis.entity.TweetExample;
import com.kamanon.domain.model.mybatis.entity.Usr;
import com.kamanon.domain.model.mybatis.mapper.TweetMapper;

/**
 * ページのtweetリスト表示関連処理
 * */
@Service
@Transactional
public class TweetListService {

	@Autowired
	TweetMapper tweetMapper;
	
	/**
	 * ユーザーIDで検索し、ツイート一覧を取得する。
	 * @param usr Tweet取得対象ユーザー
	 * @return 対象ユーザーのTweetリスト
	 */
	public List<Tweet> selectTweetList(Usr usr){
		TweetExample where = new TweetExample();
		where.createCriteria().andUserIdEqualTo(usr.getUserId());
		return tweetMapper.selectByExample(where);
	}
}
