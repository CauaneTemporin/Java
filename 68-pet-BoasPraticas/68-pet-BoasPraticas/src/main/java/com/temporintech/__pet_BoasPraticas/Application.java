package com.temporintech.__pet_BoasPraticas;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.temporintech.__pet_BoasPraticas.client.ClientHttpConfiguration;
import com.temporintech.__pet_BoasPraticas.service.AbrigoService;
import com.temporintech.__pet_BoasPraticas.service.PetService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
        ClientHttpConfiguration client = new ClientHttpConfiguration();
        AbrigoService abrigoService = new AbrigoService(client);
        PetService petService = new PetService(client);
        System.out.println("##### BOAS VINDAS AO SISTEMA ADOPET CONSOLE #####");
        try {
            int opcaoEscolhida = 0;
            while (opcaoEscolhida != 5) {
                System.out.println("\nDIGITE O NÚMERO DA OPERAÇÃO DESEJADA:");
                System.out.println("1 -> Listar abrigos cadastrados");
                System.out.println("2 -> Cadastrar novo abrigo");
                System.out.println("3 -> Listar pets do abrigo");
                System.out.println("4 -> Importar pets do abrigo");
                System.out.println("5 -> Sair");

                String textoDigitado = new Scanner(System.in).nextLine();
                opcaoEscolhida = Integer.parseInt(textoDigitado);

                if (opcaoEscolhida == 1) {
                    abrigoService.listarAbrigo();
                } else if (opcaoEscolhida == 2) {
                    abrigoService.cadastrarAbrigo();
                } else if (opcaoEscolhida == 3) {
                    petService.listarPetsDoAbrigo();
                } else if (opcaoEscolhida == 4) {
                    petService.importarPetsDoAbrigo();
                } else if (opcaoEscolhida == 5) {
                    break;
                } else {
                    System.out.println("NÚMERO INVÁLIDO!");
                    opcaoEscolhida = 0;
                }
            }
            System.out.println("Finalizando o programa...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}