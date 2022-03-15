package br.com.avf.hexagonal.user.adapter.inbound.resources;

import br.com.avf.hexagonal.user.adapter.inbound.codec.Codec;
import br.com.avf.hexagonal.user.core.ports.in.commands.DeleteUserInPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-15, Tuesday
 */
@RequestMapping("/api/users")
@RestController
@RequiredArgsConstructor
public class DeleteUserResource {

    private final DeleteUserInPort port;

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        port.delete(id);
    }
}
