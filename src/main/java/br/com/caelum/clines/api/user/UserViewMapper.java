package br.com.caelum.clines.api.user;

import br.com.caelum.clines.shared.domain.User;
import br.com.caelum.clines.shared.infra.Mapper;

public class UserViewMapper implements Mapper<User, UserView>{

	@Override
	public UserView map(User source) {
		return new UserView(source.getName(), source.getEmail(), source.getPassword());
	}

}
