package br.com.avf.hexagonal.user.adapter.outbound.adapters;

import br.com.avf.hexagonal.user.adapter.inbound.codec.Codec;
import br.com.avf.hexagonal.user.adapter.outbound.repositories.UserRepository;
import br.com.avf.hexagonal.user.core.domains.User;
import br.com.avf.hexagonal.user.core.ports.out.queries.FindUserByIdOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-15, Tuesday
 */
@Component
@RequiredArgsConstructor
public class FindUserByIdAdapter implements FindUserByIdOutPort {

    private final UserRepository repository;
    private final Codec codec;

    @Override
    public User findUserById(Long id) {
        return codec.toUser(repository.findById(id).orElseThrow());
    }
}
