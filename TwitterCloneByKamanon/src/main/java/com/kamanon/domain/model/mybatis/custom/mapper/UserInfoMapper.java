package com.kamanon.domain.model.mybatis.custom.mapper;

import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.scripting.freemarker.FreeMarkerLanguageDriver;

import com.kamanon.domain.model.mybatis.custom.entity.UserInfoEntity;

public interface UserInfoMapper {

	@Lang(FreeMarkerLanguageDriver.class)
	@Select("user_info.ftl")
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
	UserInfoEntity selectUserInfoShow(@Param("userName") String userName);
}
