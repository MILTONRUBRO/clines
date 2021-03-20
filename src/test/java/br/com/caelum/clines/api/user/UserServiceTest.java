package br.com.caelum.clines.api.user;

import static org.mockito.BDDMockito.given;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.clines.shared.domain.User;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
	
    @Mock
    private UserRepository repository;
    
    private static final Long USER_CODE = 1L;
    private static final String NAME = "teste";
    private static final String EMAIL = "teste@email.com";
    private static final String PASSWORD = "123";
    private static final User DEFAULT_USER= new User(NAME, EMAIL, PASSWORD);
    private static final List<User> ALL_USER = List.of(DEFAULT_USER);
    
    @Autowired
    private UserService service;
	
    @Test
    void shouldReturnSingleAnAircraftViewWhenExistingInRepository() {


        given(repository.findById(USER_CODE)).willReturn(Optional.of(DEFAULT_USER));

       UserView userView = service.showUserById(USER_CODE);
    }
	

}
