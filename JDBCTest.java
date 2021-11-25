import java.sql.*;

public class JDBCTest
{
	Connection con;
	Statement s; // for SELECT
	PreparedStatement ps; // for INSERT, UPDATE, DELETE
	ResultSet rs;

	public JDBCTest()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // loading the driver
			con = DriverManager.getConnection("jdbc:mysql://localhost/javaclass?user=root&password="); // establishing the connection	
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
			rs = s.executeQuery("SELECT * FROM javaclass");

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
			ps = con.prepareStatement("INSERT INTO javaclass(roll_no, name, email, address) VALUES(?, ?, ?, ?)");

			ps.setString(2, "Sita");
			ps.setString(4, "dharan");
			ps.setString(3, "Sita@w.com");
			ps.setInt(1, 33);

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
			ps = con.prepareStatement("UPDATE javaclass SET name = ?, email = ?, roll_no = ?, address = ? WHERE id = ?");

			ps.setString(1, "Harry");
			ps.setString(2, "harry@w.com");
			ps.setInt(3, 330);
			ps.setString(4, "dhankuta");
			ps.setInt(5, 2);

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
			ps = con.prepareStatement("DELETE FROM javaclass WHERE id = ?");
			ps.setInt(1, 2);

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

		//j.insertData();
		//j.updateData();
		//j.deleteData();

		//j.selectData();

		j.closeConnection();
	}

}