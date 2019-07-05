package com.kamanon.domain.service.tweet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.kamanon.domain.model.entity.TwitterInfoSelectKey;
import com.kamanon.domain.model.entity.TwitterInfoSelectResult;
import com.kamanon.domain.model.entity.UserInfo;
import com.kamanon.domain.model.mybatis.custom.entity.UserInfoEntity;
import com.kamanon.domain.model.mybatis.custom.mapper.UserInfoMapper;
import com.kamanon.domain.model.mybatis.entity.TFollow;
import com.kamanon.domain.model.mybatis.entity.TFollowExample;
import com.kamanon.domain.model.mybatis.entity.TTweet;
import com.kamanon.domain.model.mybatis.entity.TTweetExample;
import com.kamanon.domain.model.mybatis.mapper.TFollowMapper;
import com.kamanon.domain.model.mybatis.mapper.TLikeTweetMapper;
import com.kamanon.domain.model.mybatis.mapper.TTweetMapper;
import com.kamanon.domain.model.mybatis.mapper.TUsrMapper;


/**
 * ユーザー情報を取得し返却する
 * */
@Scope("prototype")
@Component
public class UserInfoServiceComponent {
	
	@Autowired
	TTweetMapper _tTweetMapper;
	
	@Autowired
	TFollowMapper _tFollowMapper;
	
	@Autowired
	TLikeTweetMapper _tLikeTweetMapper;
	
	@Autowired
	UserInfoMapper _userInfoMapper;
	
	/**
	 * userNameをキーに、ユーザー情報を取得する
	 * @param key 検索キー
	 * @return ユーザー情報検索結果
	 */
	public TwitterInfoSelectResult selectUserInfoByUserName(TwitterInfoSelectKey key) {
		
		String userName = key.getUserName();
		UserInfo userInfo = new UserInfo();
		UserInfoEntity userInfoEntity = new UserInfoEntity();
		
		// ユーザー情報を取得
		userInfoEntity = _userInfoMapper.selectUserInfoShow(userName);
		
		Long userId = userInfoEntity.getUserId();
		
		userInfo.setUserInfoEntity(userInfoEntity);
		userInfo.setTweetActionCount(_userInfoMapper.countTweetAction(userId));
		
		
		// followテーブル情報を取得
//		userInfo.setFollowList(this.selectFollowByUserId(userId));
		
		
		
		TwitterInfoSelectResult twitterInfoSelectResult = new TwitterInfoSelectResult();
		twitterInfoSelectResult.setUserInfo(userInfo);
		
		return twitterInfoSelectResult;
	}
	
	private List<TTweet> selectTweetByUserId(Long userId) {
		TTweetExample where = new TTweetExample();
		where.createCriteria().andUserIdEqualTo(userId);
		return  _tTweetMapper.selectByExample(where);
	}

	private List<TFollow> selectFollowByUserId(Long userId){
		TFollowExample where = new TFollowExample();
		where.createCriteria().andUserIdEqualTo(userId);
		return _tFollowMapper.selectByExample(where);
	}
}
