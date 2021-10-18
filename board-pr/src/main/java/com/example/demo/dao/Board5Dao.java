package com.example.demo.dao;

import java.util.*;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Board5;

@Repository
public class Board5Dao {

	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	
	public List<Board5> selectAll(){
		return sqlsessiontemplate.selectList("Board5Mapper.selectAll");
	}
	public Board5 selectDetail(int no) {
		return sqlsessiontemplate.selectOne("Board5Mapper.selectDetail", no);
	}
	public int insert(Board5 paramVO) {
		return sqlsessiontemplate.insert("Board5Mapper.insert", paramVO);
	}
	public int update(Board5 paramVO) {
		return sqlsessiontemplate.update("Board5Mapper.update", paramVO);
	}
	public int delete(int no) {
		return sqlsessiontemplate.delete("Board5Mapper.delete", no);
	}
	
}