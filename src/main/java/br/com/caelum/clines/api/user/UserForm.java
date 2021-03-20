package br.com.caelum.clines.api.user;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class UserForm {
	
    @NotNull
    private String name;
    
    @NotNull
    private String email;
    
    @NotNull
    private String password;

}
