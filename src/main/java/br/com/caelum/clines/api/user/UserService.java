package br.com.caelum.clines.api.user;

import org.springframework.stereotype.Service;

import br.com.caelum.clines.shared.exceptions.ResourceNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	
	private final UserRepository repository;
    private final UserViewMapper viewMapper;

	
    public UserView showUserById(Long id) {

        var user = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cannot find user"));

        return viewMapper.map(user);
    }

}
