package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PersonaDao;
import entidad.Persona;
import entidad.Persona;

public class PersonaDaoImpl implements PersonaDao {

	private static final String delete = "DELETE FROM personas WHERE Dni = ?";
	private static final String readall = "SELECT * FROM personas";
	

	public boolean VerificarDni(String dni) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		String Query = "select dni from personas where dni = ?";	

		Connection connect = ConexionDB.getConexion().getSQLConexion();

		try
		{

			ps = connect.prepareStatement(Query);
			ps.setString(1, dni);
			rs = ps.executeQuery();

			if(rs.next()) {

				if(dni.equals(rs.getString(1))) {
					return true;
				}

			}					
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally {
			ConexionDB.getConexion().cerrarConexion();
		}

		return false;
	}


	public int Insert(Persona add) {

		PreparedStatement st;
		Connection connect = ConexionDB.getConexion().getSQLConexion();

		int filas=0;

		String Query = "insert into personas (dni,nombre,apellido) values (?,?,?)";	

		try
		{
			st = connect.prepareStatement(Query);
			st.setString(1, add.getDni());
			st.setString(2, add.getNombre());
			st.setString(3, add.getApellido());

			if(st.executeUpdate() > 0) {

				connect.commit();

				return filas + 1;

			}

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally {
			ConexionDB.getConexion().cerrarConexion();
		}

		return filas;
	}
	public boolean Delete(Persona eliminarPersona)
	{
		PreparedStatement statement;
		Connection conexion = ConexionDB.getConexion().getSQLConexion();
		boolean isDeleted = false;
		try 
		{
			statement = conexion.prepareStatement(delete);
			statement.setString(1, eliminarPersona.getDni());
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				isDeleted = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return isDeleted;
	}
	
	public List<Persona> ReadAll()
	{
		PreparedStatement statement;
		ResultSet resultSet;
		ArrayList<Persona> personas = new ArrayList<Persona>();
		ConexionDB conexion = ConexionDB.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(readall);
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				personas.add(getPersona(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return personas;
	}
	
	private Persona getPersona(ResultSet resultSet) throws SQLException
	{
		String dni = resultSet.getString("Dni");
		String nombre = resultSet.getString("Nombre");
		String apellido = resultSet.getString("Apellido");
		return new Persona(dni, nombre, apellido);
	}


	@Override
	public int Update(Persona p) {
		// TODO Auto-generated method stub
		PreparedStatement st;
		Connection connect = ConexionDB.getConexion().getSQLConexion();

		int filas=0;

		//String Query = "update personas SET Nombre=' "+p.getNombre()+" ',"+" Apellido=' "+p.getApellido()+" ', "+" WHERE Dni=' "+p.getDni()+" ' ";	
		String Query = "update personas SET nombre=?, apellido=? where dni=?";

		try
		{
			st = connect.prepareStatement(Query);
			st.setString(1, p.getNombre());
			st.setString(2, p.getApellido());
			st.setString(3, p.getDni());

			if(st.executeUpdate() > 0) {

				connect.commit();

				return filas + 1;

			}

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally {
			ConexionDB.getConexion().cerrarConexion();
		}

		return filas;

	}


}
