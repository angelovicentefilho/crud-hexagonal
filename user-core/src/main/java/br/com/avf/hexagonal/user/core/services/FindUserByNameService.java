package br.com.avf.hexagonal.user.core.services;

import br.com.avf.hexagonal.user.core.domains.User;
import br.com.avf.hexagonal.user.core.ports.in.queries.FindUserByNameInPort;
import br.com.avf.hexagonal.user.core.ports.out.queries.FindUserByNameOutPort;

import java.util.List;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
public class FindUserByNameService implements FindUserByNameInPort {

    private final FindUserByNameOutPort out;

    public FindUserByNameService(FindUserByNameOutPort out) {
        this.out = out;
    }

    @Override
    public List<User> findUserByName(String name) {
        return out.findUserByName(name);
    }
}
