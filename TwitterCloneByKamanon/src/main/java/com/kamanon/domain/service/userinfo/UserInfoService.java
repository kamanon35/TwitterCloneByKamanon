package com.kamanon.domain.service.userinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kamanon.domain.model.entity.TwitterInfoSelectKey;
import com.kamanon.domain.model.entity.TwitterInfoSelectResult;

/**
 * ページのtweetリスト表示関連処理
 */
@Service
public class UserInfoService extends UserInfoServiceAbstract {

	@Autowired
	UserInfoServiceComponent userInfoServiceComponent;

	@Override
	@Transactional
	protected TwitterInfoSelectResult execute(TwitterInfoSelectKey key) {
		return userInfoServiceComponent.selectUserInfoByUserName(key);
	}
}
