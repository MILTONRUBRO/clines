package br.com.caelum.clines.api.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserView {
	
    private String name;
    private String email;
    private String password;

}
