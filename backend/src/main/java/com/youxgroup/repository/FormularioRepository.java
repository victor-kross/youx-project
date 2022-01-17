package com.youxgroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.youxgroup.model.Formulario;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioRepository extends JpaRepository<Formulario, Long> {

}
