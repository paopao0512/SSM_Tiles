package com.mvc.service;

import com.mvc.dao.Dao;
import com.mvc.model.TypeClass;
import com.mvc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceImpl implements PersonService{
	@Autowired
	Dao dao;
	@Override
	public int queryWork(int isWork){
		return dao.queryWork(isWork);
	}
	@Override
	public List<Student> queryGood(int isGood){
		return dao.queryGood(isGood);
	}
	/*@Override
	public Student queryGood(int isGood){
		return dao.queryGood(isGood);
	}*/
	@Override
	public TypeClass queryDirection(String direction){
		return dao.queryDirection(direction);
	}
	@Override
	public int queryType(String type){
		return dao.queryType(type);
	}
}
