package com.connection.chainsys;
import java.sql.*;




public class ConnectionUtil {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
        
	        Connection connection =getConnection();
	        System.out.println(connection);
	        update();
	        delete();
	        insert();
	        result();
	        
	}
	    public static Connection getConnection() throws ClassNotFoundException,SQLException {
	       
	            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ productinfo", "root", "Guru@7733");
	        return connection ;
	    }
	    
	    public static void update() throws ClassNotFoundException, SQLException {
	    	Connection connection=getConnection();
	    	String query="update productpricefixing set noofwarranty=2 where ID=1 ";
	    	PreparedStatement p=connection.prepareStatement(query);
	    	System.out.println("Table updated");
	    	p.execute();
	    	connection.close();
	    }
	    public static void delete() throws ClassNotFoundException, SQLException {
	    	Connection connection=getConnection();
	    	String query="delete from productpricefixing where ID=23";
	    	PreparedStatement p=connection.prepareStatement(query);
	    	System.out.println("Delete Row");
	    	p.execute();
	    	connection.close();
	    }
	    public static void insert() throws ClassNotFoundException, SQLException {
	    	Connection connection=getConnection();
	    	String query="insert into productpricefixing value(2,'NissanGt',122600000,4,5)";
	    	String query1="insert into productpricefixing value(3,'Nissan',122600000,4,5)";
	    	String query2="insert into productpricefixing value(4,'Niss',122600000,4,5)";
	    	String query3="insert into productpricefixing value(5,'Ni',122600000,4,5)";
	    	PreparedStatement p=connection.prepareStatement(query);
	    	PreparedStatement p1=connection.prepareStatement(query1);
	    	PreparedStatement p2=connection.prepareStatement(query2);
	    	PreparedStatement p3=connection.prepareStatement(query3);
	    	System.out.println("Insert Table");
	    	p.execute();
	    	p1.execute();
	    	p2.execute();
	    	p3.execute();
	    	
	    	connection.close();
	    	
	    }
	    public static void result() throws ClassNotFoundException, SQLException {
			Connection connection =getConnection();
			String query="Select *from productpricefixing";
			Statement sc=connection.createStatement();
			ResultSet rs=sc.executeQuery(query);
			ResultSetMetaData rsmd=rs.getMetaData();
			int columnNumber =rsmd.getColumnCount();
			
			while(rs.next()) {
				for(int i=1;i<=columnNumber;i++) {
					String columnValue = rs.getString(i);
					System.out.println( rsmd.getColumnName(i)+ " : "+columnValue+" ");
					System.out.println("");
				}
			}
			
			
		}
	 

	}


