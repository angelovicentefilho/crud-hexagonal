package br.com.avf.hexagonal.user.core.services;

import br.com.avf.hexagonal.user.core.domains.User;
import br.com.avf.hexagonal.user.core.ports.in.commands.UpdateUserInPort;
import br.com.avf.hexagonal.user.core.ports.out.commands.UpdateUserOutPort;
import br.com.avf.hexagonal.user.core.ports.out.queries.FindAllUsersOutPort;
import br.com.avf.hexagonal.user.core.ports.out.queries.FindUserByIdOutPort;

import java.util.Objects;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
public class UpdateUserService implements UpdateUserInPort {

    private final UpdateUserOutPort outPort;
    private final FindUserByIdOutPort search;

    public UpdateUserService(UpdateUserOutPort outPort, FindUserByIdOutPort search) {
        this.outPort = outPort;
        this.search = search;
    }

    @Override
    public User update(User user) {
        var dbUser = search.findUserById(user.getId());
        if (Objects.isNull(dbUser)) {
            throw new IllegalStateException("non exists");
        }
        return outPort.update(user);
    }
}
