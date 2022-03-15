package br.com.avf.hexagonal.user.adapter.inbound.codec;

import br.com.avf.hexagonal.user.adapter.inbound.entities.UserEntity;
import br.com.avf.hexagonal.user.adapter.inbound.protocols.UserRequest;
import br.com.avf.hexagonal.user.adapter.inbound.protocols.UserResponse;
import br.com.avf.hexagonal.user.core.domains.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
@Component
public class Codec {

    public User toUser(UserEntity entity) {
        User user = new User();
        BeanUtils.copyProperties(entity, user);
        return user;
    }

    public UserResponse toUserResponse(User user) {
        UserResponse response = new UserResponse();
        BeanUtils.copyProperties(user, response);
        return response;
    }

    public UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(user, entity);
        return entity;
    }

    public User toUser(UserRequest request) {
        User user = new User();
        BeanUtils.copyProperties(request, user);
        return user;
    }

    public List<UserResponse> toUserResponseList(List<User> users) {
        return users.stream().map(this::toUserResponse).collect(Collectors.toList());
    }
}
