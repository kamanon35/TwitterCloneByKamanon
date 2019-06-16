package com.kamanon.domain.model.mybatis.mapper;

import com.kamanon.domain.model.mybatis.entity.Follow;
import com.kamanon.domain.model.mybatis.entity.FollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table follow
	 * @mbg.generated  Sat Jun 15 05:42:31 JST 2019
	 */
	long countByExample(FollowExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table follow
	 * @mbg.generated  Sat Jun 15 05:42:31 JST 2019
	 */
	int deleteByExample(FollowExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table follow
	 * @mbg.generated  Sat Jun 15 05:42:31 JST 2019
	 */
	int insert(Follow record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table follow
	 * @mbg.generated  Sat Jun 15 05:42:31 JST 2019
	 */
	int insertSelective(Follow record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table follow
	 * @mbg.generated  Sat Jun 15 05:42:31 JST 2019
	 */
	List<Follow> selectByExample(FollowExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table follow
	 * @mbg.generated  Sat Jun 15 05:42:31 JST 2019
	 */
	int updateByExampleSelective(@Param("record") Follow record, @Param("example") FollowExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table follow
	 * @mbg.generated  Sat Jun 15 05:42:31 JST 2019
	 */
	int updateByExample(@Param("record") Follow record, @Param("example") FollowExample example);
}