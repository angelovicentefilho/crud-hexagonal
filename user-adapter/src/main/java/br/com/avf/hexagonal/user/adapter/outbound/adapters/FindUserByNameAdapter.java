package br.com.avf.hexagonal.user.adapter.outbound.adapters;

import br.com.avf.hexagonal.user.adapter.inbound.codec.Codec;
import br.com.avf.hexagonal.user.adapter.outbound.repositories.UserRepository;
import br.com.avf.hexagonal.user.core.domains.User;
import br.com.avf.hexagonal.user.core.ports.out.queries.FindUserByNameOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-15, Tuesday
 */
@Component
@RequiredArgsConstructor
public class FindUserByNameAdapter implements FindUserByNameOutPort {

    private final UserRepository repository;
    private final Codec codec;

    @Override
    public List<User> findUserByName(String name) {
        return repository.findUserEntityByName(name).stream()
                .map(codec::toUser).collect(Collectors.toList());
    }
}
