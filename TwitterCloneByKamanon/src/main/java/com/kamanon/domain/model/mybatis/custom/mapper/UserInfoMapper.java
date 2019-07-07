package com.kamanon.domain.model.mybatis.custom.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kamanon.domain.model.mybatis.custom.entity.TweetActionCount;
import com.kamanon.domain.model.mybatis.custom.entity.UserInfoEntity;

/*ユーザー情報取得マッパー*/
@Mapper
public interface UserInfoMapper {

	/*
	 * ユーザー名をキーに以下ユーザー情報を取得
	 * userId
	 * userName
	 * handleName
	 * birthDay
	 * @Param userName
	 * ユーザー名
	 * */
	UserInfoEntity selectUserInfoShow(@Param("userName") String userName);

	/*
	 * ツイートアクション数を取得
	 * tweetCount
	 * followCount
	 * followerCount
	 * likeCount
	 * @Param userId
	 * 	ユーザーID
	 * @Param likeFlg
	 * いいねフラグ
	 * */
	TweetActionCount countTweetAction(@Param("userId") Long userId, @Param("likeFlg") String likeFlg);
}
