package com.kamanon.domain.model.mybatis.custom.entity;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * DBから取得したツイート情報を取得
 * @author kamanon
 *
 */
@Data
public class TweetInfoEntity {

	/*ツイートID*/
	private Integer tweetId;
	/*ユーザーID*/
	private Integer userId;
	/*ツイート*/
	private String tweet;
	/*リツイートフラグ*/
	private String retweetFlg;
	/*作成日時*/
	private LocalDateTime created;
}
