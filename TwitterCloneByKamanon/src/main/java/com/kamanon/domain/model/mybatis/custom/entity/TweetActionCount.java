package com.kamanon.domain.model.mybatis.custom.entity;

import lombok.Data;

/**
 * Tweetアクション数を保持
 * @author kamanon
 *
 */
@Data
public class TweetActionCount {

	private Integer followCount;
	
	private Integer followerCount;
	
	private Integer likeCount;
}
