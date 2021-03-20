package br.com.caelum.clines.api.user;

import static org.springframework.http.ResponseEntity.created;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caelum.clines.api.aircraft.AircraftForm;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("users")
@AllArgsConstructor
public class UserController {
	
	private final UserService service;
	
    @GetMapping("{id}")
    public UserView show(@PathVariable Long id) {
        return service.showUserById(id);
    }
    
    @GetMapping
    public List<UserView> list(){
    	return service.listAllUser();
    }
    
    @PostMapping
    ResponseEntity<?> createBy(@RequestBody @Valid UserForm form) {
        var code = service.createUserBy(form);

        var uri = URI.create("/user/").resolve(code);

        return created(uri).build();
    }
}
