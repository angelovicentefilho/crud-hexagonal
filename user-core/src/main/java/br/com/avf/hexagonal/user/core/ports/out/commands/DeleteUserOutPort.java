package br.com.avf.hexagonal.user.core.ports.out.commands;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
public interface DeleteUserOutPort {

    void delete(Long id);
}
