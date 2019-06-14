package com.kamanon.domain.model.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * 検索キーを保持するクラス
 * */
@SuppressWarnings("serial")
@Data
public class TwitterInfoSelectKey implements Serializable{

	private Long userId;
	
	private String userName;
	
	private String keyWord;
}
