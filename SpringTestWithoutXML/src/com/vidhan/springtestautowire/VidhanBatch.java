package com.vidhan.springtestautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vidhanBatch")
public class VidhanBatch {

@Autowired
private Student student;

public String getStudentName()
{
	System.out.println(student.getStudentName());
	return student.getStudentName(); 
}
}
