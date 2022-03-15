package br.com.avf.hexagonal.user.adapter.inbound.resources;

import br.com.avf.hexagonal.user.adapter.inbound.codec.Codec;
import br.com.avf.hexagonal.user.adapter.inbound.protocols.UserRequest;
import br.com.avf.hexagonal.user.adapter.inbound.protocols.UserResponse;
import br.com.avf.hexagonal.user.core.ports.in.commands.CreateUserInPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-15, Tuesday
 */
@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class CreateUserResource {

    private final CreateUserInPort port;
    private final Codec codec;

    @PostMapping
    public UserResponse create(@RequestBody UserRequest request) {
        return codec.toUserResponse(port.create(codec.toUser(request)));
    }
}
