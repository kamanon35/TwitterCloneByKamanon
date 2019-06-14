package com.kamanon.domain.service.tweet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kamanon.domain.model.entity.TwitterInfoSelectKey;
import com.kamanon.domain.model.entity.TwitterInfoSelectResult;
import com.kamanon.domain.model.mybatis.entity.Tweet;
import com.kamanon.domain.model.mybatis.entity.TweetExample;
import com.kamanon.domain.model.mybatis.mapper.TweetMapper;

/**
 * ページのtweetリスト表示関連処理
 */
@Service
@Transactional
public class UserInfoService extends KamanonServiceAbstract {

	@Autowired
	UserInfoServiceComponent userInfoServiceComponent;

	@Override
	protected TwitterInfoSelectResult execute(TwitterInfoSelectKey key) {
		return userInfoServiceComponent.selectUserInfoByUserName(key);
	}
}
