package br.com.avf.hexagonal.user.adapter.inbound.resources;

import br.com.avf.hexagonal.user.adapter.inbound.codec.Codec;
import br.com.avf.hexagonal.user.adapter.inbound.protocols.UserResponse;
import br.com.avf.hexagonal.user.core.ports.in.queries.FindUserByNameInPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-15, Tuesday
 */
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class FindUserByNameResource {

    private final FindUserByNameInPort port;
    private final Codec codec;

    @GetMapping("/{name}")
    public List<UserResponse> findByName(@PathVariable String name) {
        return codec.toUserResponseList(port.findUserByName(name));
    }
}
