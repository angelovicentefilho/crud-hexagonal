package br.com.avf.hexagonal.user.core.ports.in.commands;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
public interface DeleteUserInPort {

    void delete(Long id);
}
