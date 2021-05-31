package daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
		
	
	/* EJECUTAR EN LA DB
	 * 
	 * CREATE DATABASE `bdPersonas`;
      USE bdPersonas;
      CREATE TABLE `Personas`(
     `Dni` varchar(20) NOT NULL,
     `Nombre` varchar(45) NOT NULL,
     `Apellido` varchar(45) NOT NULL,
      PRIMARY KEY (`Dni`));
	 *  
	 *  
	 *  
	 *  */
	
	public static ConexionDB instancia;
	private Connection connection;
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "AV23CJ30";
	private String dbName = "bdpersonas";
	
	private ConexionDB()
	{
		try
		{
			this.connection = DriverManager.getConnection(host+dbName,user,pass);
			this.connection.setAutoCommit(false);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static ConexionDB getConexion()   
	{								
		if(instancia == null)
		{
			instancia = new ConexionDB();
		}
		return instancia;
	}

	public Connection getSQLConexion() 
	{
		return this.connection;
	}
	
	public void cerrarConexion()
	{
		try 
		{
			this.connection.close();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		instancia = null;
	}
}
