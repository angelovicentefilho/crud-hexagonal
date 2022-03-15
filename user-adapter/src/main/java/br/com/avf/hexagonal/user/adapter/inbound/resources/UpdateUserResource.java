package br.com.avf.hexagonal.user.adapter.inbound.resources;

import br.com.avf.hexagonal.user.adapter.inbound.codec.Codec;
import br.com.avf.hexagonal.user.adapter.inbound.protocols.UserRequest;
import br.com.avf.hexagonal.user.adapter.inbound.protocols.UserResponse;
import br.com.avf.hexagonal.user.core.ports.in.commands.UpdateUserInPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-15, Tuesday
 */
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UpdateUserResource {

    private final UpdateUserInPort port;
    private final Codec codec;

    @PutMapping
    public UserResponse update(@RequestBody UserRequest request) {
        return codec.toUserResponse(port.update(codec.toUser(request)));
    }
}
