package com.devdumba.sportcenter.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appuser")
public class AppUser {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "appuser_id_seq")
    @SequenceGenerator(name = "appuser_id_seq", sequenceName = "appuser_id_seq", allocationSize = 1)
    private Integer id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String phone;
    private String image;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "id_role", referencedColumnName = "id", nullable = false)})
    private Role role;


    public AppUser(Integer o, String s, String password, String firstname, String lastname, String phone, Role role) {
        this.id = o;
        this.username = s;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.role = role;
    }
}
