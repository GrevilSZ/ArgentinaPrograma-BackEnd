
package com.portfoliosz.sz.Interface;

import com.portfoliosz.sz.Entity.Persona;
import java.util.List;



public interface IPersonaService {

    //Trae una lista de Personas
    public List<Persona> getPersona();
        
    //Guardar un objeto-Persona
    public void savePersona(Persona persona);
        
    //Eliminar una persona por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
