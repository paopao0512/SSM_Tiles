package com.mvc.dao;

import com.mvc.model.Team;
import com.mvc.model.TypeClass;
import com.mvc.model.Student;
import com.mvc.model.User;

import java.util.List;

public interface Dao {

	int queryWork(int isWork);
	List<Student> queryGood(int isGood);
	/*Student queryGood(int isGood);*/
	/*TypeClass queryDirection(String direction);*/
	List<TypeClass> queryDirection (String direction);
	int queryType(String type);
	User queryUser(String userName);
	boolean addUser(User user);
	User queryID(String a);
}