package dao;
import java.util.List;

import entidad.Persona;

public interface PersonaDao {
	
	public int Insert (Persona P);
	public boolean VerificarDni(String dni);
	public boolean Delete(Persona p);
	public List<Persona> ReadAll();
	public int Update(Persona P);
}
