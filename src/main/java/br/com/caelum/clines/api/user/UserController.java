package br.com.caelum.clines.api.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
