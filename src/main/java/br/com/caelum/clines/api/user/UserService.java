package br.com.caelum.clines.api.user;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.caelum.clines.api.aircraft.AircraftForm;
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


	public List<UserView> listAllUser() {
		return repository.findAll().stream().map(viewMapper::map).collect(Collectors.toList());
	}
	
	  public Long createUserBy(UserForm form) {
	        repository.findBy(form.getEmail()).ifPresent(user -> {
	                throw new ResourceAlreadyExistsException("User already exists");
	        });

	        var user = userMapper.map(form);

	        repository.save(user);

	        return user.getEmail();
	    }

}
