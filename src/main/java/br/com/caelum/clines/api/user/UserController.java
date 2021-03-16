package br.com.caelum.clines.api.user;

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
    UserView show(@PathVariable Long id) {
        return service.showUserById(id);
    }
}
