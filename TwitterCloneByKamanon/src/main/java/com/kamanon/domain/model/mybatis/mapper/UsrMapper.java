package com.kamanon.domain.model.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kamanon.domain.model.mybatis.entity.Usr;
import com.kamanon.domain.model.mybatis.entity.UsrExample;

public interface UsrMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	long countByExample(UsrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	int deleteByExample(UsrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	int deleteByPrimaryKey(Long userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	int insert(Usr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	int insertSelective(Usr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	List<Usr> selectByExample(UsrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	Usr selectByPrimaryKey(Long userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	int updateByExampleSelective(@Param("record") Usr record, @Param("example") UsrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	int updateByExample(@Param("record") Usr record, @Param("example") UsrExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	int updateByPrimaryKeySelective(Usr record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usr
	 * @mbg.generated  Tue Jul 02 15:03:07 JST 2019
	 */
	int updateByPrimaryKey(Usr record);
}