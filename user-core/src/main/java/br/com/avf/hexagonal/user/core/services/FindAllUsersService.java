package br.com.avf.hexagonal.user.core.services;

import br.com.avf.hexagonal.user.core.domains.User;
import br.com.avf.hexagonal.user.core.ports.in.queries.FindAllUsersInPort;
import br.com.avf.hexagonal.user.core.ports.out.queries.FindAllUsersOutPort;

import java.util.List;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
public class FindAllUsersService implements FindAllUsersInPort {

    private final FindAllUsersOutPort out;

    public FindAllUsersService(FindAllUsersOutPort out) {
        this.out = out;
    }

    @Override
    public List<User> findAll() {
        return out.findAll();
    }
}
