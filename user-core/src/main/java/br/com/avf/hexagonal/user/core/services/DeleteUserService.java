package br.com.avf.hexagonal.user.core.services;

import br.com.avf.hexagonal.user.core.ports.in.commands.DeleteUserInPort;
import br.com.avf.hexagonal.user.core.ports.out.commands.DeleteUserOutPort;
import br.com.avf.hexagonal.user.core.ports.out.queries.FindUserByIdOutPort;

import java.util.Objects;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
public class DeleteUserService implements DeleteUserInPort {

    private final DeleteUserOutPort outPort;
    private final FindUserByIdOutPort search;

    public DeleteUserService(DeleteUserOutPort outPort, FindUserByIdOutPort search) {
        this.outPort = outPort;
        this.search = search;
    }

    @Override
    public void delete(Long id) {
        var user = search.findUserById(id);
        if (Objects.isNull(user)) {
            throw new IllegalStateException("non exists");
        }
        outPort.delete(id);
    }
}
