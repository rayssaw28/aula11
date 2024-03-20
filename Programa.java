/*
 * Copyright (C) 2024 Rayssa Alves <rayssaalves.go@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package exAula11;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Rayssa Alves <rayssaalves.go@gmail.com>
 * @date 20/03/2024
 * @brief Class Programa
 */
public class Programa {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Inicializa um scanner
        
        ArrayList <Veiculo> veiculos = new ArrayList<>(); // Cria uma lista para armazenar quantidades indefinidas de veículos cadastrados.
        
        while (true) { // loop que mantem o menu até o usuário escolher sair.
            System.out.println();
            System.out.println("Selecione a ação:");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Editar veículo");
            System.out.println("3 - Excluir veículo");
            System.out.println("4 - Sair"); //menu de opções

            int opcao = scanner.nextInt(); //Lê a opção escolhida pelo usuário 
            
            switch (opcao) { // Realizar ações de acordo com a opção escolhida
            
            case 1:
                cadastrarVeiculo(scanner, veiculos);
                break;
            case 2:
                editarVeiculo(scanner, veiculos);
                break;
            case 3:
                excluirVeiculo(scanner, veiculos);
                break;
            case 4:
                return; // Encerra o programa
            default:
                System.out.println("Opção inválida."); 
               
        }
        }      
}
    
    private static void cadastrarVeiculo(Scanner scanner, ArrayList <Veiculo> veiculos) { // Método para cadastrar novo veículo
  
        System.out.println();
        System.out.println("Selecione o tipo de veículo:");
        System.out.println("1 - Caminhão");
        System.out.println("2 - Ônibus"); // Menu de seleção de ônibus e caminhão
        int tipo = scanner.nextInt();
        
        System.out.println();
        System.out.println("Insira a placa do veículo: ");
        String placa = scanner.next();
        System.out.println("Insira o ano do veículo: ");
        int ano = scanner.nextInt(); // Lê os dados do veículo
        
       switch (tipo) { // Realizar ações de acordo com a opção escolhida
           
           case 1:
            System.out.println("Digite a quantidade de eixos:");
            int eixos = scanner.nextInt();
            veiculos.add(new Caminhao(placa, ano, eixos)); // Adiciona informações do veículo a lista 
            System.out.println("Cadastro concluído.");
            break; // Cadastra caminhão com sua quantidade de eixos 
           case 2:
            System.out.println("Digite o número de assentos:");
            int assentos = scanner.nextInt();
            veiculos.add(new Onibus(placa, ano, assentos)); // Adiciona informações do veículo a ArrayList 
            System.out.println("Cadastro concluído.");
            break; // Cadastra ônibus com sua quantidade de assentos
           default:
            System.out.println("Opção inválida.");
        }
    }
    
    private static void editarVeiculo(Scanner scanner, ArrayList <Veiculo> veiculos) { // Método para edição de veículos
        
        System.out.println();
        System.out.println("Insira a placa do veículo que deseja editar: ");
        String placa = scanner.next();
        
    for (Veiculo veiculo : veiculos) { //Itera sobre a lista de veículos
            if (veiculo.getPlaca().equals(placa)) { // Verifica se o veículo está presente na ArrayList
                System.out.println("Digite o novo ano do veículo:");
                int novoAno = scanner.nextInt();
                veiculo.setAno(novoAno); //Seta o novo ano do veículo
                System.out.println("Veículo editado.");
                return;
            }
        }
    
        System.out.println("Veículo não localizado."); // Mensagem de erro caso o veículo não esteja na lista
    
    }
    
    private static void excluirVeiculo(Scanner scanner, ArrayList <Veiculo> veiculos) { // Método para exclusão de veículos
        
        System.out.println();
        System.out.println("Insira a placa do veículo que deseja excluir: ");
        String placa = scanner.next();
        
        for (int i = 0; i < veiculos.size(); i++) { // Itera sobre a lista de veículos
            Veiculo veiculo = veiculos.get(i);
            if (veiculo.getPlaca().equals(placa)) { // Verifica se o veículo está presente na lista
                veiculos.remove(i); // Remove o veículo da lista
                System.out.println("Veículo excluído com sucesso!");
                return;
        
    }
    
        }
        
        System.out.println("Veículo não encontrado."); // Mensagem de erro caso o veículo não esteja na ArrayList
        
    }
}
