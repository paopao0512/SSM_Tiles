package com.mvc.service;

import com.mvc.model.TypeClass;
import com.mvc.model.Student;

import java.util.List;

public interface PersonService {

	int queryWork(int isWork)throws Exception;
	List<Student> queryGood(int isGood)throws Exception;
	/*Student queryGood(int isGood)throws Exception;*/
	/*TypeClass queryDirection(String direction)throws Exception;*/
	List<TypeClass> queryDirection (String direction) throws Exception;
	int queryType(String type)throws Exception;
}
