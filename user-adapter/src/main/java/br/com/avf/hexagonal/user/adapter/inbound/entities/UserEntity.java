package br.com.avf.hexagonal.user.adapter.inbound.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-03-14, Monday
 */
@Entity
@Table(name = "tbl_users")
@Data
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String address;
}
