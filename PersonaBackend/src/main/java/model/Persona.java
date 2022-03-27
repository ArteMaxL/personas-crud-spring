package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	
	private Pais pais;
	private Estado estado;

}
