package com.kamanon.domain.model.mybatis.entity;

import java.time.LocalDateTime;

public class TTweet {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tweet.tweet_id
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    private Long tweetId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tweet.user_id
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tweet.tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    private String tweet;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tweet.retweet_flg
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    private String retweetFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tweet.created
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    private LocalDateTime created;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tweet.tweet_id
     *
     * @return the value of t_tweet.tweet_id
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public Long getTweetId() {
        return tweetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tweet.tweet_id
     *
     * @param tweetId the value for t_tweet.tweet_id
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public void setTweetId(Long tweetId) {
        this.tweetId = tweetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tweet.user_id
     *
     * @return the value of t_tweet.user_id
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tweet.user_id
     *
     * @param userId the value for t_tweet.user_id
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tweet.tweet
     *
     * @return the value of t_tweet.tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public String getTweet() {
        return tweet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tweet.tweet
     *
     * @param tweet the value for t_tweet.tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public void setTweet(String tweet) {
        this.tweet = tweet == null ? null : tweet.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tweet.retweet_flg
     *
     * @return the value of t_tweet.retweet_flg
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public String getRetweetFlg() {
        return retweetFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tweet.retweet_flg
     *
     * @param retweetFlg the value for t_tweet.retweet_flg
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public void setRetweetFlg(String retweetFlg) {
        this.retweetFlg = retweetFlg == null ? null : retweetFlg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_tweet.created
     *
     * @return the value of t_tweet.created
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_tweet.created
     *
     * @param created the value for t_tweet.created
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}