package br.com.caelum.clines.api.user;

import java.util.Optional;

import org.springframework.data.repository.Repository;

import br.com.caelum.clines.shared.domain.User;

public interface UserRepository  extends Repository<User, Long>{
	
	Optional<User> findById(Long id);

}
