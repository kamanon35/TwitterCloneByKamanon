package com.kamanon.domain.model.mybatis.custom.entity;

import java.time.LocalDate;

import lombok.Data;

/**
 * DBから取得したユーザー情報を保持
 * 
 * @author kamanon
 *
 */

@Data
public class UserInfoEntity {

	/*ユーザーID*/
	private Long userId;
	/*ユーザー名*/
	private String userName;
	/*ハンドルネーム*/
	private String handleName;
	/*生年月日*/
	private LocalDate birthday;
}
