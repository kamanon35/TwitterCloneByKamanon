package com.kamanon.domain.model.mybatis.custom.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.kamanon.domain.model.mybatis.custom.entity.TweetInfoEntity;

/*ツイート情報取得マッパー*/
@Mapper
public interface TweetInfoMapper {

	/*
	 * ユーザーIDをキーに以下ツイート情報を取得
	 * tweetId
	 * userId
	 * tweet
	 * retweetFlg
	 * created
	 * @Param userId
	 * ユーザーID
	 * @Param retweetFlg
	 * リツイートフラグ
	 * */
	List<TweetInfoEntity> selectTweetInfoShow(@Param("userId") Long userId, @Param("retweetFlg") String retweetFlg);

	/**
	 * ユーザーIDの一致する最新レコードを取得
	 * */
	TweetInfoEntity selectLatestTweet(@Param("userId") Long userId);
}
