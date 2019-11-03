package com.balindra.student;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.balindra.student.dal.entity.Student;
import com.balindra.student.dal.repository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentApplicationTests {
	
	@Autowired
	private StudentRepository studentRepo;


//	@Test
//	public void testCreateStudent() {
//		Student student=new Student();
//		student.setName("John");
//		student.setCourse("EA");
//		student.setFee(2000d);
//		
//		
//		
//		studentRepo.save( student);
//	}
	
	
	@Test
	public void testFindStudentById() {
		Student student=new Student();
		student.setId(1L);
		student.setName("John");
		student.setCourse("EA");
		student.setFee(2000d);
		
		assertEquals(student,studentRepo.findById(1L).get());
	}



@Test
public void UpdateStudentById() {
	Student student=new Student();
	student.setId(1L);
	student.setName("John");
	student.setCourse("FPP");
	student.setFee(3000.00);
	studentRepo.save(student);
	//assertEquals(3000d,studentRepo.findById(1L).get().getFee());
	double expected=studentRepo.findById(1L).get().getFee();
	System.out.println("====================================");
	System.out.println("expected :"+expected);
	System.out.println("====================================");
	assertEquals(expected, 3000.0, 0.00);
	
}

}