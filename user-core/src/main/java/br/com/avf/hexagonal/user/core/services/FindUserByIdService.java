package br.com.avf.hexagonal.user.core.services;

import br.com.avf.hexagonal.user.core.domains.User;
import br.com.avf.hexagonal.user.core.ports.in.queries.FindUserByIdInPort;
import br.com.avf.hexagonal.user.core.ports.out.queries.FindUserByIdOutPort;

import java.util.Optional;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
public class FindUserByIdService implements FindUserByIdInPort {

    private final FindUserByIdOutPort out;

    public FindUserByIdService(FindUserByIdOutPort out) {
        this.out = out;
    }

    @Override
    public User findUserById(Long id) {
        return out.findUserById(id);
    }
}
