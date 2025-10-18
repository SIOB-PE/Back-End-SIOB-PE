package com.siob_pe.siob_pe.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "Usuario")
public class Usuario {

    @Id
    private String id;

    private String matricula;

    private String nome;

    private String email;

    private LocalDate dataNascimento;

    private String senha;

    private TipoUsuario tipoUsuario;

}
