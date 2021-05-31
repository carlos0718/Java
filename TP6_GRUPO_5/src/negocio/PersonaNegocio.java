package negocio;

import java.util.List;

import entidad.Persona;

public interface PersonaNegocio {
	
	public int insert(Persona add);
	public boolean delete(Persona eliminarPersona);
	public List<Persona> readAll();
	public int update(Persona updatePersona);
}
