package com.temporintech.__UsuarioDados_Mapstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UsuarioMapper usuarioMapper) {
		return args -> {
			UsuarioRequest usuarioRequest = UsuarioRequest.
					builder().
					nome("Matheus").
					email("matheus@dev.com").
					senha("123").
					build();

			UsuarioEntity usuarioEntity = usuarioMapper.map(usuarioRequest);
			usuarioEntity.setId(1);
			usuarioEntity.setDataCriacao(LocalDateTime.now());

			UsuarioResponse usuarioResponse = usuarioMapper.map(usuarioEntity);
			System.out.println(usuarioResponse);
		};
	}
}
