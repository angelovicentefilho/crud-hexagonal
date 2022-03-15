package br.com.avf.hexagonal.user.adapter.outbound.adapters;

import br.com.avf.hexagonal.user.adapter.inbound.codec.Codec;
import br.com.avf.hexagonal.user.adapter.outbound.repositories.UserRepository;
import br.com.avf.hexagonal.user.core.domains.User;
import br.com.avf.hexagonal.user.core.ports.out.commands.CreateUserOutPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
@Component
@AllArgsConstructor
public class CreateUserAdapter implements CreateUserOutPort {

    private final UserRepository repository;
    private final Codec codec;

    @Override
    public User create(User user) {
        return codec.toUser(repository.save(codec.toEntity(user)));
    }
}
