package com.kamanon.domain.model.entity;

import java.io.Serializable;
import java.util.List;

import com.kamanon.domain.model.mybatis.custom.entity.TweetActionCount;
import com.kamanon.domain.model.mybatis.custom.entity.UserInfoEntity;
import com.kamanon.domain.model.mybatis.entity.TFollow;
import com.kamanon.domain.model.mybatis.entity.TTweet;

import lombok.Data;

/**
 * Tweet内容などユーザー情報を保持するクラス
 */
@SuppressWarnings("serial")
@Data
public class UserInfo implements Serializable {

	/* ユーザー情報エンティティ */
	private UserInfoEntity userInfoEntity;
	
	/* ツイートアクション数 */
	private TweetActionCount tweetActionCount;

	/* ツイートリスト */
	private List<TTweet> tweetList;

	/* フォローリスト */
	private List<TFollow> followList;

	/* フォロワーリスト */
	private List<TFollow> followerList;

	/* いいねリスト */
}
