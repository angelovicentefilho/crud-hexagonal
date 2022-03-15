package br.com.avf.hexagonal.user.adapter.configurations;

import br.com.avf.hexagonal.user.adapter.outbound.adapters.*;
import br.com.avf.hexagonal.user.core.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
@Configuration
public class UserServicesConfiguration {

    @Bean
    public CreateUserService createUserService(CreateUserAdapter adapter) {
        return new CreateUserService(adapter);
    }

    @Bean
    public UpdateUserService updateUserService(UpdateUserAdapter adapter, FindUserByIdAdapter search) {
        return new UpdateUserService(adapter, search);
    }

    @Bean
    public DeleteUserService deleteUserService(DeleteUserAdapter adapter, FindUserByIdAdapter search) {
        return new DeleteUserService(adapter, search);
    }

    @Bean
    public FindUserByNameService findUserByNameService(FindUserByNameAdapter adapter) {
        return new FindUserByNameService(adapter);
    }

    @Bean
    public FindAllUsersService findAllUsersService(FindAllUsersAdapter adapter) {
        return new FindAllUsersService(adapter);
    }
}
