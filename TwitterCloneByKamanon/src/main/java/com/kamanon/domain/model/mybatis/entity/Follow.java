package com.kamanon.domain.model.mybatis.entity;

import java.util.Date;

public class Follow {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column follow.user_id
	 * @mbg.generated  Fri Jun 14 11:31:13 JST 2019
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column follow.follow_user_id
	 * @mbg.generated  Fri Jun 14 11:31:13 JST 2019
	 */
	private Long followUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column follow.created
	 * @mbg.generated  Fri Jun 14 11:31:13 JST 2019
	 */
	private Date created;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column follow.user_id
	 * @return  the value of follow.user_id
	 * @mbg.generated  Fri Jun 14 11:31:13 JST 2019
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column follow.user_id
	 * @param userId  the value for follow.user_id
	 * @mbg.generated  Fri Jun 14 11:31:13 JST 2019
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column follow.follow_user_id
	 * @return  the value of follow.follow_user_id
	 * @mbg.generated  Fri Jun 14 11:31:13 JST 2019
	 */
	public Long getFollowUserId() {
		return followUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column follow.follow_user_id
	 * @param followUserId  the value for follow.follow_user_id
	 * @mbg.generated  Fri Jun 14 11:31:13 JST 2019
	 */
	public void setFollowUserId(Long followUserId) {
		this.followUserId = followUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column follow.created
	 * @return  the value of follow.created
	 * @mbg.generated  Fri Jun 14 11:31:13 JST 2019
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column follow.created
	 * @param created  the value for follow.created
	 * @mbg.generated  Fri Jun 14 11:31:13 JST 2019
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
}