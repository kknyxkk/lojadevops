package br.com.indra.jovemprofissional.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.indra.jovemprofissional.model.Usuario;


@Repository
public interface UserRepository extends CrudRepository<Usuario, String> {
	/*
	@Query("SELECT PASSWORD FROM TB_USERLOGIN WHERE USERNAME=name")
	public String GetPass(@Param("name") String name);*/
	
}

