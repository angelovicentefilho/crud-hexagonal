package br.com.avf.hexagonal.user.core.services;

import br.com.avf.hexagonal.user.core.domains.User;
import br.com.avf.hexagonal.user.core.ports.in.commands.CreateUserInPort;
import br.com.avf.hexagonal.user.core.ports.out.commands.CreateUserOutPort;

import java.util.Objects;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
public class CreateUserService implements CreateUserInPort {

    private final CreateUserOutPort outPort;

    public CreateUserService(CreateUserOutPort outPort) {
        this.outPort = outPort;
    }

    @Override
    public User create(User user) {
        if (Objects.nonNull(user)) {
            return outPort.create(user);
        }
        throw new IllegalStateException();
    }
}
