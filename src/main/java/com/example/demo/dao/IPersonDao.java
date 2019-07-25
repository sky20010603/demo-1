package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.boot;

public interface IPersonDao {
	/**
	 * 显示全部
	 */
	public List<boot> findall();
	
	/**
	 * 根据id删除
	 */
	public int deletebyid(@Param("id") Integer id);
}
