package com.mybatis3.services;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

import com.mybatis3.domain.Student;

//import junit.framework.Assert;

public class StudentServiceTest {

	private static StudentService studentService;
	
	@BeforeClass
	public static void setup() {
		studentService = new StudentService();
	}
	
	@AfterClass
	public static void teardown() {
		studentService = null;
	}
	
	@Test
	public void testFindStudentById() {
		Student student = studentService.findStudentById(1);
		Assert.assertNotNull(student);
		System.out.println(student);
	}
	@Test
	public void testFindStudentById2() {
		Student student = studentService.findStudentById2(1);
		Assert.assertNotNull(student);
		System.out.println(student);
	}	
}
