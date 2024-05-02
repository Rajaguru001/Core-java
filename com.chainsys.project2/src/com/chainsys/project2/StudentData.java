package com.chainsys.project2;

import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentData {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata", "root",
				"Guru@7733");
		return connection;
	}

	public static void insert(int id, String name, String bloodGrp, String phoneNo)
			throws ClassNotFoundException, SQLException {

		Connection connection = StudentData.getConnection();

		String Details = "insert into studentdatabase values (?,?,?,?)";

		PreparedStatement preparedstm = connection.prepareStatement(Details);
		preparedstm.setInt(1, id);
		preparedstm.setString(2, name);
		preparedstm.setString(3, bloodGrp);
		preparedstm.setString(4, phoneNo);

		preparedstm.execute();
		System.out.println("sucess" + "\n");

	}

	public static void update(StudentDetailspj si) throws ClassNotFoundException, SQLException {
//		StudentDetailspj si=new StudentDetailspj();
		Connection connection = getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Name update:");
		String ans = sc.next();
		System.out.println("ID update:");
		int up = sc.nextInt();
		si.setStudentname(ans);
		si.setID(up);
		String updatename = "update studentdatabase set studentname=? where id=? ";
		PreparedStatement preparedstm = connection.prepareStatement(updatename);
		preparedstm.setString(1, si.getStudentname());
		preparedstm.setInt(2, si.getID());
		preparedstm.execute();

	}

	public static void result() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "Select *from studentdatabase";
		Statement sc = connection.createStatement();
		ResultSet rs = sc.executeQuery(query);
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnNumber = rsmd.getColumnCount();

		while (rs.next()) {
			for (int i = 1; i <= columnNumber; i++) {
				String columnValue = rs.getString(i);
				System.out.println(rsmd.getColumnName(i) + " : " + columnValue + " ");
				System.out.println("");
			}
		}
	}
}
