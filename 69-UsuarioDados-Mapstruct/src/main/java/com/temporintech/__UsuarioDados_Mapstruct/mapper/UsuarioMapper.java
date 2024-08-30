package com.temporintech.__UsuarioDados_Mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import com.temporintech.__UsuarioDados_Mapstruct.dto.UsuarioRequest;
import com.temporintech.__UsuarioDados_Mapstruct.dto.UsuarioResponse;
import com.temporintech.__UsuarioDados_Mapstruct.entity.UsuarioEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface UsuarioMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataCriacao", ignore = true)
    UsuarioEntity map(UsuarioRequest usuarioRequest);

    @Mapping(target = "name", source = "nome")
    UsuarioResponse map(UsuarioEntity usuarioEntity);
}