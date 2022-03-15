package br.com.avf.hexagonal.user.core.ports.in.queries;

import br.com.avf.hexagonal.user.core.domains.User;

import java.util.List;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
public interface FindAllUsersInPort {
    List<User> findAll();
}
