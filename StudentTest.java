package com.studentapp.test;

import java.util.Scanner;

import com.studentapp.dao.StudentDao;
import com.studentapp.dto.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		StudentDao sdao = new StudentDao();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("---------------STUDENT REG---------------------------");
		System.out.println("Enter SID for a Student");
		int sid  = sc.nextInt();
		System.out.println("Enter Name for a student");
		String name = sc.next();
		System.out.println("Enter the phone number of a student");
		long phone = sc.nextLong();
		System.out.println("Enter mail ID of student");
		String mail = sc.next();
		System.out.println("Enter branch of Student");
		String branch = sc.next();
		System.out.println("Enter the location");
		String location = sc.next();
		System.out.println("Enter  the password");
		String password = sc.next();
		System.out.println("Confirm the password");
		String confirm = sc.next();
		
		if(password.equals(confirm)) {
			Student s = new Student(sid, name, phone, mail, branch, location, password);
			boolean res = sdao.insertStudent(s);
			System.out.println("Data Saved");
			
		}
		else {
			System.out.println("Password MisMatch");
		}

  
	
	}
}
