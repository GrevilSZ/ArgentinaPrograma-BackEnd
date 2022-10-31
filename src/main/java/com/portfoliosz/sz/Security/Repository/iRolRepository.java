
package com.portfoliosz.sz.Security.Repository;

import com.portfoliosz.sz.Security.Entity.Rol;
import com.portfoliosz.sz.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);            
}
