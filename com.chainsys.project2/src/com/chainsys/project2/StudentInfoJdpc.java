package com.chainsys.project2;

import java.sql.SQLException;
import java.util.*;

public class StudentInfoJdpc {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentDetailspj si = new StudentDetailspj();
		StudentData sd = new StudentData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to Insert or Update");
		String swtch=sc.next();
		switch(swtch.toLowerCase()) {
		case "Insert":
			sd.insert(si.getID(), si.getStudentname(), si.getBloodgroup(), si.getPhonenumber());
			break;
			
		case "update":
			sd.update(si);
			
			
			
			
		}
		System.out.println("Enter The Name: ");
		String name = sc.next();
		si.setStudentname(name);

		System.out.println("Enter The ID:");
		int Id = sc.nextInt();
		si.setID(Id);

		System.out.println("Enter The bloodgroup:");
		String bloodgroup = sc.next();
		si.setBloodgroup(bloodgroup);

		System.out.println("Enter The phonenumber:");
		String phonenumber = sc.next();
		si.setPhonenumber(phonenumber);

		sd.insert(si.getID(), si.getStudentname(), si.getBloodgroup(), si.getPhonenumber());
		sd.update(si);
		sd.result();

	}

}
