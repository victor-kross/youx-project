package com.youxgroup.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Formulario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private String nascimento;
	private String peso;
	private String altura;
	private Boolean medicamento;
	private String areaSaude;
	private String regiao;
	private String descricao;
	
 
}
