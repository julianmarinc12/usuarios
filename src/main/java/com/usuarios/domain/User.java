package com.usuarios.domain;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


@Data
@Entity
@Table(name = "user",schema = "user")
public class User implements Serializable {
    private static final long serialVersionUID=1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String lastname;
    @NotEmpty
    private String email;
    @NotEmpty
    private String date;


}
