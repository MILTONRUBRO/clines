package br.com.caelum.clines.api.user;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.caelum.clines.shared.domain.User;

class UserViewMapperTest {
	
	private static final String NAME = "Ragnar Lothbrook";
	private static final String EMAIL = "Ragnar@hotmail.com";
	private static final String PASSWORD = "whowanttobeking";
	private static final UserViewMapper mapper = new UserViewMapper();

	@Test
	void shouldConvertUserToUserView() {
		var user = new User(NAME, EMAIL, PASSWORD);
		UserView userView = mapper.map(user);
		
        assertEquals(NAME, userView.getName());
        assertEquals(EMAIL, userView.getEmail());

	}

}
