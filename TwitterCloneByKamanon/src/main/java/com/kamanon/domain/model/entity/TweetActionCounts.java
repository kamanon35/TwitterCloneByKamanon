package com.kamanon.domain.model.entity;

import lombok.Data;

/**
 * Tweetアクション数を保持
 * @author kamanon
 *
 */
@Data
public class TweetActionCounts {

	private Integer followCount;
	
	private Integer followerCount;
	
	private Integer likeCount;
}
