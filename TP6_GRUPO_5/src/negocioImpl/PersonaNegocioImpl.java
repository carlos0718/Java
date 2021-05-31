package negocioImpl;
import java.util.List;

import dao.PersonaDao;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;
import negocio.PersonaNegocio;

public class PersonaNegocioImpl implements PersonaNegocio {
	
	PersonaDao PDAO = new PersonaDaoImpl();
	
	@Override
	public int insert (Persona PersonaADD) {
		
            if(!PersonaADD.getDni().isEmpty() && !PersonaADD.getApellido().isEmpty() && !PersonaADD.getNombre().isEmpty()) {
			
			///// VERIFICAR QUE EL DNI NO EXISTA EN LA DB
			
			if(PDAO.VerificarDni(PersonaADD.getDni())==true) return 1;
			else {
				
				////// AGREGO A DB
				
				if(PDAO.Insert(PersonaADD)==1) return 2;
				else return 3;
			}			
		}
		else return 0;
	}
	
	@Override
	public boolean delete(Persona eliminarPersona) {
		boolean estado=false;
		if(PDAO.VerificarDni(eliminarPersona.getDni()))
		{
			estado=PDAO.Delete(eliminarPersona);
			
		}
		return estado;
	}

	@Override
	public List<Persona> readAll() {
		return PDAO.ReadAll();
	}

	@Override
	public int update(Persona updatePersona) {
		// TODO Auto-generated method stub
		if(PDAO.Update(updatePersona)==1) return 1;
		else return 0;
	}
	
}
