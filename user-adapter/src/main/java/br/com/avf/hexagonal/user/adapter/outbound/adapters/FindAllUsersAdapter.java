package br.com.avf.hexagonal.user.adapter.outbound.adapters;

import br.com.avf.hexagonal.user.adapter.inbound.codec.Codec;
import br.com.avf.hexagonal.user.adapter.outbound.repositories.UserRepository;
import br.com.avf.hexagonal.user.core.domains.User;
import br.com.avf.hexagonal.user.core.ports.out.queries.FindAllUsersOutPort;
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
public class FindAllUsersAdapter implements FindAllUsersOutPort {

    private final UserRepository repository;
    private final Codec codec;

    @Override
    public List<User> findAll() {
        return repository.findAll().stream()
                .map(codec::toUser).collect(Collectors.toList());
    }
}
