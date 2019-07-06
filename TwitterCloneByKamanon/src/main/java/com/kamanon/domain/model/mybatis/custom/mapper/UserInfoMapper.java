package com.kamanon.domain.model.mybatis.custom.mapper;

import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.scripting.freemarker.FreeMarkerLanguageDriver;

import com.kamanon.domain.model.mybatis.custom.entity.TweetActionCount;
import com.kamanon.domain.model.mybatis.custom.entity.UserInfoEntity;

public interface UserInfoMapper {

	/*
	 * ユーザー名をキーに以下ユーザー情報を取得
	 * userId
	 * userName
	 * handleName
	 * birthDay
	 * followCount
	 * followerCount
	 * likeCount
	 * */
	@Lang(FreeMarkerLanguageDriver.class)
	@Select("selectUserInfoShow.ftl")
	UserInfoEntity selectUserInfoShow(@Param("n") String userName);
	
	/*
	 * ツイートアクション数を取得
	 * */
	@Lang(FreeMarkerLanguageDriver.class)
	@Select("countTweetAction.ftl")
	TweetActionCount countTweetAction(@Param("userId") Long userId);
}
