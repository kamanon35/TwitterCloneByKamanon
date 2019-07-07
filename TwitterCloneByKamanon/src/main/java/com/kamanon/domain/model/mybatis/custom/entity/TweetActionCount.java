package com.kamanon.domain.model.mybatis.custom.entity;

import lombok.Data;

/**
 * DBから取得したTweetアクション数を保持
 * @author kamanon
 *
 */
@Data
public class TweetActionCount {

	/*ツイート数*/
	private Integer tweetCount;
	/*フォロー数*/
	private Integer followCount;
	/*フォロワー数*/
	private Integer followerCount;
	/*いいね数*/
	private Integer likeCount;
}
