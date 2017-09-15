package br.com.indra.jovemprofissional.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.indra.jovemprofissional.repository.UserRepository;


@Entity(name = "TB_USERLOGIN")
public class Usuario{

	@Id	
	private String USERNAME;

	private String PASS;

	
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
	

	





}