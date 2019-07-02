package com.kamanon.domain.model.mybatis.entity;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class Usr {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usr.user_id
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	private Long userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usr.user_name
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usr.password
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usr.handle_name
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	private String handleName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usr.email_addr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	private String emailAddr;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usr.sex
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	private String sex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usr.birthday
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	private LocalDate birthday;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usr.created
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	private LocalDateTime created;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column usr.updated
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	private LocalDateTime updated;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usr.user_id
	 * @return  the value of usr.user_id
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usr.user_id
	 * @param userId  the value for usr.user_id
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usr.user_name
	 * @return  the value of usr.user_name
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usr.user_name
	 * @param userName  the value for usr.user_name
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usr.password
	 * @return  the value of usr.password
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usr.password
	 * @param password  the value for usr.password
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usr.handle_name
	 * @return  the value of usr.handle_name
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public String getHandleName() {
		return handleName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usr.handle_name
	 * @param handleName  the value for usr.handle_name
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public void setHandleName(String handleName) {
		this.handleName = handleName == null ? null : handleName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usr.email_addr
	 * @return  the value of usr.email_addr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public String getEmailAddr() {
		return emailAddr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usr.email_addr
	 * @param emailAddr  the value for usr.email_addr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr == null ? null : emailAddr.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usr.sex
	 * @return  the value of usr.sex
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usr.sex
	 * @param sex  the value for usr.sex
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usr.birthday
	 * @return  the value of usr.birthday
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public LocalDate getBirthday() {
		return birthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usr.birthday
	 * @param birthday  the value for usr.birthday
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usr.created
	 * @return  the value of usr.created
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public LocalDateTime getCreated() {
		return created;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usr.created
	 * @param created  the value for usr.created
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column usr.updated
	 * @return  the value of usr.updated
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public LocalDateTime getUpdated() {
		return updated;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column usr.updated
	 * @param updated  the value for usr.updated
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}
}