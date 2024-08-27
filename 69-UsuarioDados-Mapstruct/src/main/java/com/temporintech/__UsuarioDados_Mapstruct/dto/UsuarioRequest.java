package com.temporintech.__UsuarioDados_Mapstruct.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuarioRequest {

    private String nome;

    private String email;

    private String senha;
}