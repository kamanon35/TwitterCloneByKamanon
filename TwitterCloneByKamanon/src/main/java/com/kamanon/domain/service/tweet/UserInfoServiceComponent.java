package com.kamanon.domain.service.tweet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.kamanon.domain.model.entity.TwitterInfoSelectKey;
import com.kamanon.domain.model.entity.TwitterInfoSelectResult;
import com.kamanon.domain.model.entity.UserInfo;
import com.kamanon.domain.model.mybatis.entity.Follow;
import com.kamanon.domain.model.mybatis.entity.FollowExample;
import com.kamanon.domain.model.mybatis.entity.Tweet;
import com.kamanon.domain.model.mybatis.entity.TweetExample;
import com.kamanon.domain.model.mybatis.entity.Usr;
import com.kamanon.domain.model.mybatis.entity.UsrExample;
import com.kamanon.domain.model.mybatis.mapper.FollowMapper;
import com.kamanon.domain.model.mybatis.mapper.TweetMapper;
import com.kamanon.domain.model.mybatis.mapper.UsrMapper;


/**
 * ユーザー情報を取得し返却する
 * */
@Scope("prototype")
@Component
public class UserInfoServiceComponent {
	
	@Autowired
	UsrMapper usrMapper;
	
	@Autowired
	TweetMapper tweetMapper;
	
	@Autowired
	FollowMapper followMapper;
	
	@Autowired
	TwitterInfoSelectResult twitterInfoSelectResult;
	
	@Autowired
	UserInfo userInfo;
	
	/**
	 * userNameをキーに、ユーザー情報を取得する
	 * @param key 検索キー
	 * @return ユーザー情報検索結果
	 */
	public TwitterInfoSelectResult selectUserInfoByUserName(TwitterInfoSelectKey key) {
		
		String userName = key.getUserName();
		
		// usrをセット
		userInfo.setUsr(this.selectUsrByUserName(userName));
		
		Long userId = userInfo.getUsr().getUserId();
		return twitterInfoSelectResult;
		
		
	}
	
	/**
	 * @param userName ユーザー名
	 * @return ユーザー情報
	 */
	private Usr selectUsrByUserName(String userName) {
		UsrExample where = new UsrExample();
		where.createCriteria().andUserNameEqualTo(userName);
		return usrMapper.selectByExample(where).get(0);
	}
	
	/**
	 * @param userId ユーザーID
	 * @return ツイートリスト
	 */
	private List<Tweet> selectTweetByUserId(Long userId) {
		TweetExample where = new TweetExample();
		where.createCriteria().andUserIdEqualTo(userId);
		return tweetMapper.selectByExample(where);
	}
	
	private List<Follow> selectFollowByUserId(Long userId){
		FollowExample where = new FollowExample();
		where.createCriteria().andUserIdEqualTo(userId);
		return followMapper.selectByExample(where);
	}
	
}
