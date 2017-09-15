package br.com.indra.jovemprofissional.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.indra.jovemprofissional.model.Usuario;

@Repository
public interface UserRepository extends CrudRepository<Usuario, String> {
	    
}

