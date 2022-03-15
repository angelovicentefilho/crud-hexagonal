package br.com.avf.hexagonal.user.core.ports.out.commands;

import br.com.avf.hexagonal.user.core.domains.User;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
public interface UpdateUserOutPort {

    User update(User user);

}
