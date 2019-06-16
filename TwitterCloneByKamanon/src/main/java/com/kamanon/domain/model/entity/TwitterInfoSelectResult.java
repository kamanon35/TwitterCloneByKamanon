package com.kamanon.domain.model.entity;

import java.io.Serializable;
import java.util.List;

import com.kamanon.domain.model.mybatis.entity.Tweet;

import lombok.Data;

/**
 * 検索結果を保持するクラス
 * */
@SuppressWarnings("serial")
@Data
public class TwitterInfoSelectResult implements Serializable{

	// ユーザー情報
	UserInfo userInfo;
	
	// キーワードで検索したツイート一覧を保持
	List<Tweet> selectResultTweetList;
	
}
