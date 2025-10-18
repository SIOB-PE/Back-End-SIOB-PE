package com.siob_pe.siob_pe.Controller.DTO;

import com.siob_pe.siob_pe.Model.TipoUsuario;

import java.time.LocalDate;
import java.util.UUID;

public record UsuarioDTO(

        String id,

        String matricula,

        String nome,

        String email,

        LocalDate dataNascimento,

        String senha,

        TipoUsuario tipoUsuario
) {
}
