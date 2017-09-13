package br.com.indra.jovemprofissional.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "TB_CLIENTE")
public class Cliente {

	@Id	
	private int ID_CLIENTE;

	private String NO_CLIENTE;

	
	public Cliente(){}

	public Cliente(int ID_CLIENTE, String NO_CLIENTE){
		this.NO_CLIENTE = NO_CLIENTE;
		this.ID_CLIENTE = ID_CLIENTE;

	}
	
	
	public int getID_CLIENTE() {
		return ID_CLIENTE;
	}

	public void setID_CLIENTE(int ID_CLIENTE) {
		ID_CLIENTE = ID_CLIENTE;
	}

	public String getNO_CLIENTE() {
		return NO_CLIENTE;
	}

	public void setNO_CLIENTE(String NO_CLIENTE) {
		NO_CLIENTE = NO_CLIENTE;
		
	}

	





}