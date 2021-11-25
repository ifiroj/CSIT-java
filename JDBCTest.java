import java.sql.*;

public class JDBCTest
{
	Connection con; // for connection
	Statement s; // for SELECT
	PreparedStatement ps; // for INSERT, UPDATE, DELETE
	ResultSet rs;

	public JDBCTest()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // loading the driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javaclass?user=root&password="); // establishing the connection 
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}		
	}

	public void closeConnection()
	{
		try
		{
			con.close();	
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}	
	}

	public void selectData()
	{
		try
		{
			s = con.createStatement();
			rs = s.executeQuery("SELECT * FROM records");

			while(rs.next())
			{
				System.out.println("NAME : " + rs.getString("name"));
				System.out.println("ADDRESS : " + rs.getString("address"));
				System.out.println("EMAIL : " + rs.getString("email"));
				System.out.println("ROLL : " + rs.getString("roll_no"));
				System.out.println("--------------------------------------------");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

	public void insertData()
	{
		try
		{
			ps = con.prepareStatement("INSERT INTO records(name, address, email, roll_name) VALUES(?, ?, ?, ?)");

			ps.setString(1, "John Cena");
			ps.setString(2, "New York");
			ps.setString(3, "demo@email.com");
			ps.setInt(4, 33);

			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}	
	}

	public void updateData()
	{
		try
		{
			ps = con.prepareStatement("UPDATE records SET name = ?, address = ?, email = ?, roll_no = ? WHERE id = ?");

			ps.setString(1, "Jeff Hardy");
			ps.setString(2, "London");
			ps.setString(3, "demo@email.com");
			ps.setInt(4, 23);
			ps.setInt(5, 3);

			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}	
	}

	public void deleteData()
	{
		try
		{
			ps = con.prepareStatement("DELETE FROM records WHERE id = ?");
			ps.setInt(1, 3);

			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}	
	}


	public static void main(String[] t)
	{
		JDBCTest j = new JDBCTest();

		j.insertData();
		//j.updateData();
		//j.deleteData();

		j.selectData();

		j.closeConnection();
	}

}