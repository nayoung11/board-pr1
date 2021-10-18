package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Board5Dao;
import com.example.demo.model.Board5;

@Service
public class Board5Service{
	@Autowired
	private Board5Dao board5Dao;
	
	public List<Board5> selectAll(){
		return board5Dao.selectAll();
	}
	public Board5 selectDetail(int no) {
		return board5Dao.selectDetail(no);
	}
	public int insert(Board5 paramVO) {
		return board5Dao.insert(paramVO);
	}
	public int update(Board5 paramVO) {
		return board5Dao.update(paramVO);
	}
	public int delete(int no) {
		return board5Dao.delete(no);
	}

}
