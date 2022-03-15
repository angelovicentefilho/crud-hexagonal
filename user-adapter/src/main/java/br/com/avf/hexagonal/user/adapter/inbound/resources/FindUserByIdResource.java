package br.com.avf.hexagonal.user.adapter.inbound.resources;

import br.com.avf.hexagonal.user.adapter.inbound.codec.Codec;
import br.com.avf.hexagonal.user.adapter.inbound.protocols.UserResponse;
import br.com.avf.hexagonal.user.core.ports.out.queries.FindUserByIdOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-15, Tuesday
 */
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class FindUserByIdResource {

    private final FindUserByIdOutPort port;
    private final Codec codec;

    @GetMapping("/{id}/user")
    public UserResponse findById(@PathVariable Long id) {
        return codec.toUserResponse(port.findUserById(id));
    }

}
