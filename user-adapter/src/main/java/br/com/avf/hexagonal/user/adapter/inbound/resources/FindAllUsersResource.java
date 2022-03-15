package br.com.avf.hexagonal.user.adapter.inbound.resources;

import br.com.avf.hexagonal.user.adapter.inbound.codec.Codec;
import br.com.avf.hexagonal.user.adapter.inbound.protocols.UserResponse;
import br.com.avf.hexagonal.user.core.ports.in.queries.FindAllUsersInPort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-15, Tuesday
 */
@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class FindAllUsersResource {

    private final FindAllUsersInPort port;
    private final Codec codec;

    @GetMapping
    public List<UserResponse> users() {
        return codec.toUserResponseList(port.findAll());
    }

}
