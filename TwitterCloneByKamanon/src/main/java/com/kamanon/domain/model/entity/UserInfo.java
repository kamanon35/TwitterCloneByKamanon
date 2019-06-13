package com.kamanon.domain.model.entity;

import java.io.Serializable;
import java.util.List;

import com.kamanon.domain.model.mybatis.entity.Follow;
import com.kamanon.domain.model.mybatis.entity.Tweet;
import com.kamanon.domain.model.mybatis.entity.Usr;

import lombok.Data;

/**
 * Tweet内容などユーザー情報を保持するクラス
 * */
@SuppressWarnings("serial")
@Data
public class UserInfo implements Serializable{

	// ユーザー情報
	Usr usr;
	
	// つぶやきリスト
	List<Tweet> tweetList;
	
	// フォローリスト
	List<Follow> followList;
}
