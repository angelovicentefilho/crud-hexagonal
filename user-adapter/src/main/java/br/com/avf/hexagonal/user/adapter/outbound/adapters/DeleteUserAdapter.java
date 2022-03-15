package br.com.avf.hexagonal.user.adapter.outbound.adapters;

import br.com.avf.hexagonal.user.adapter.outbound.repositories.UserRepository;
import br.com.avf.hexagonal.user.core.ports.out.commands.DeleteUserOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-15, Tuesday
 */
@Component
@RequiredArgsConstructor
public class DeleteUserAdapter implements DeleteUserOutPort {

    private final UserRepository repository;

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
