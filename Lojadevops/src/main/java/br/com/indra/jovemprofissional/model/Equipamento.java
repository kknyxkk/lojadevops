package br.com.indra.jovemprofissional.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "TB_EQUIPAMENTO")
public class Equipamento {

	@Id	
	private int ID_EQUIPAMENTO;

	private String NO_EQUIPAMENTO;
	
	private String NO_TIPO_EQUIPAMENTO;
	
	public String getNO_TIPO_EQUIPAMENTO() {
		return NO_TIPO_EQUIPAMENTO;
	}

	public void setNO_TIPO_EQUIPAMENTO(String NO_TIPO_EQUIPAMENTO) {
		NO_TIPO_EQUIPAMENTO = NO_TIPO_EQUIPAMENTO;
	}

	public Equipamento(){}

	public Equipamento(int ID_EQUIPAMENTO) {
		
		this.ID_EQUIPAMENTO = ID_EQUIPAMENTO;
	}

	public Equipamento(int ID_EQUIPAMENTO, String NO_EQUIPAMENTO) {
		
		this.ID_EQUIPAMENTO = ID_EQUIPAMENTO;
		this.NO_EQUIPAMENTO = NO_EQUIPAMENTO;
	}

	public int getID_EQUIPAMENTO() {
		return ID_EQUIPAMENTO;
	}

	public void setID_EQUIPAMENTO(int ID_EQUIPAMENTO) {
		ID_EQUIPAMENTO = ID_EQUIPAMENTO;
	}

	public String getNO_EQUIPAMENTO() {
		return NO_EQUIPAMENTO;
	}

	public void setNO_EQUIPAMENTO(String NO_EQUIPAMENTO) {
		NO_EQUIPAMENTO = NO_EQUIPAMENTO;
	}

	

	





}



