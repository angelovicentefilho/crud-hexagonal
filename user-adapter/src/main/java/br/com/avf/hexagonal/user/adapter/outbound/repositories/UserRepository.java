package br.com.avf.hexagonal.user.adapter.outbound.repositories;

import br.com.avf.hexagonal.user.adapter.inbound.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findUserEntityByName(String name);
}
