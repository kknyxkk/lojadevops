package br.com.indra.jovemprofissional.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tb_usuario")
public class Usuario{

	@Id	
	private String USERNAME;

	private String PASS;
	
	private String NOME_COMPLETO;
	
	private String EMAIL;
	
	public Usuario(){}

	public Usuario(String _USERNAME, String _PASSWORD){
		this.USERNAME = _USERNAME;
		this.PASS = _PASSWORD;

	}
	
	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String _USERNAME) {
		USERNAME = _USERNAME;
	}

	public String getPASSWORD() {
		return PASS;
	}

	public void setPASSWORD(String _PASSWORD) {
		PASS = _PASSWORD;
		
	}
	
	public String getNOMECOMPLETO() {
		return NOME_COMPLETO;
	}
	
	public void setNOMECOMPLETO(String _NOMECOMPLETO) {
		NOME_COMPLETO = _NOMECOMPLETO;
	}
	
	public String getEMAIL() {
		return EMAIL;
	}
	
	public void setEMAIL(String _EMAIL) {
		EMAIL = _EMAIL;
	}
}