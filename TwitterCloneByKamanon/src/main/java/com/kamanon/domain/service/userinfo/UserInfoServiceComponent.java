package com.kamanon.domain.service.userinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.kamanon.domain.model.entity.TwitterInfoSelectKey;
import com.kamanon.domain.model.entity.TwitterInfoSelectResult;
import com.kamanon.domain.model.entity.UserInfo;
import com.kamanon.domain.model.mybatis.custom.entity.TweetActionCount;
import com.kamanon.domain.model.mybatis.custom.entity.TweetInfoEntity;
import com.kamanon.domain.model.mybatis.custom.entity.UserInfoEntity;
import com.kamanon.domain.model.mybatis.custom.mapper.TweetInfoMapper;
import com.kamanon.domain.model.mybatis.custom.mapper.UserInfoMapper;
import com.kamanon.utils.KamanonConstants;

/**
 * ユーザー情報を取得し返却する
 * */
@Scope("prototype")
@Component
public class UserInfoServiceComponent {

	@Autowired
	UserInfoMapper _userInfoMapper;
	@Autowired
	TweetInfoMapper _tweetInfoMapper;

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

		// ツイートアクション数を取得
		TweetActionCount tweetActionCount = _userInfoMapper.countTweetAction(userId, KamanonConstants.LIKE_FLG_ON);
		userInfo.setTweetActionCount(tweetActionCount);

		// ツイートを取得
		List<TweetInfoEntity> tweetInfoEntityList = _tweetInfoMapper.selectTweetInfoShow(userId,
				KamanonConstants.RETWEET_FLG_ON);

		userInfo.setUserInfoEntity(userInfoEntity);
		userInfo.setTweetActionCount(tweetActionCount);
		userInfo.setTweetInfoEntityList(tweetInfoEntityList);

		// ユーザー情報取得結果を設定
		TwitterInfoSelectResult twitterInfoSelectResult = new TwitterInfoSelectResult();
		twitterInfoSelectResult.setUserInfo(userInfo);

		return twitterInfoSelectResult;
	}
}
