package ProjetoEstoque.Main;

import java.util.Scanner;
import java.util.Locale;
import ProjetoEstoque.entity.Produto;
import ProjetoEstoque.entity.Estoque;
import ProjetoEstoque.entity.Transacao;
import ProjetoEstoque.entity.Produtos.Comida;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Estoque estoque = new Estoque(100, 100);
        int escolha;
    do{
        System.out.println("Sistema de Estoque!");
        System.out.println("Selecione uma funcionalidade do menu principal:");
        System.out.println("1- Realizar transações de estoque");
        System.out.println("2- Consulta de estoque");
        System.out.println("3- Gerenciamento de produtos");
        System.out.println("Digite -1 para sair do programa");

        escolha = sc.nextInt();

        switch (escolha) {

            case 1:
                realizarTransacao(sc);
                break;
            case 2:
                consultarEstoque(sc);
                break;
            case 3:
                gerenciarProduto(sc);
                break;
           
            default:
                System.out.println("Opção inválida, tente novamente.");
                break;
        }
    
    }
    while (escolha != -1);
        sc.close();
    }

    

    private static void realizarTransacao(Scanner sc) {
        System.out.println("Selecione o tipo do produto que voce deseja transicionar (Adicionar/Retirar produto especifico):");
        System.out.println("1- Comida");
        System.out.println("2- Eletronico");
        System.out.println("3- Roupa");

        int tipoDoProduto = sc.nextInt();
        switch (tipoDoProduto) {
            case 1:
             
                System.out.println("Voce deseja adicionar ou retirar esse produto? (1- Adicionar, 2- Retirar)");
                int tipoDeTransacao = sc.nextInt();
                switch (tipoDeTransacao) {
                    case 1:
                        System.out.println("Digite a quantidade que deseja adicionar");
                        int adicaoComida = sc.nextInt();
                        // Adicionar blablabla
                        break;

                    case 2:
                        System.out.println("Digite a quantidade que deseja retirar");
                        int retirarComida = sc.nextInt();
                        // Retirar blablabla chama a classe e tal
                        break;

                    default:
                        System.out.println("Nenhuma opcao escolhida");
                        break;
                }
                break;

            case 2:
                System.out.println("Voce deseja adicionar ou retirar esse produto? (1- Adicionar, 2- Retirar)");
                tipoDeTransacao = sc.nextInt();
                switch (tipoDeTransacao) {
                    case 1:
                        System.out.println("Digite a quantidade que deseja adicionar");
                        int adicaoEletronico = sc.nextInt();
                        // Adicionar 
                        break;

                    case 2:
                        System.out.println("Digite a quantidade que deseja retirar");
                        int retirarEletronico = sc.nextInt();
                        // Retirar 
                        break;

                    default:
                        System.out.println("Nenhuma opcao escolhida");
                        break;
                }
                break;

            case 3:
                System.out.println("Voce deseja adicionar ou retirar esse produto? (1- Adicionar, 2- Retirar)");
                tipoDeTransacao = sc.nextInt();
                switch (tipoDeTransacao) {
                    case 1:
                        System.out.println("Digite a quantidade que deseja adicionar");
                        int adicaoRoupa = sc.nextInt();
                        // Adicionar 
                        break;

                    case 2:
                        System.out.println("Digite a quantidade que deseja retirar");
                        int retirarRoupa = sc.nextInt();
                        // Retirar 
                        break;

                    default:
                        System.out.println("Nenhuma opcao escolhida");
                        break;
                }
                break;

            default:
                System.out.println("Nenhuma opcao escolhida");
                break;
        }
    }

    private static void consultarEstoque(Scanner sc) {
        System.out.println("Selecione o tipo do produto que voce deseja consultar o estoque:");
        System.out.println("1- Comida");
        System.out.println("2- Eletronico");
        System.out.println("3- Roupa");

        int tipoDoProduto = sc.nextInt();
        switch (tipoDoProduto) {
            case 1:
                System.out.println("Digite o id da comida a ser consultada");
                String nomeComidaConsulta = sc.next();
               
            case 2:
                System.out.println("Digite o nome do eletronico a ser consultado");
                String nomeEletronicoConsulta = sc.next();
                break;

            case 3:
                System.out.println("Digite o nome da roupa a ser consultada");
                String nomeRoupaConsulta = sc.next();
               break;

           default:
               System.out.println("Nenhuma opcao escolhida");
               break;
       }
   }

   private static void gerenciarProduto(Scanner sc) {

    System.out.println("Voce deseja 1-adicionar ou 2-remover?:");
    int escolha = sc.nextInt();

    switch (escolha) {
        case 1:
        System.out.println("Selecione o tipo do produto que você deseja adicionar:");
        System.out.println("1- Comida");
        System.out.println("2- Eletronico");
        System.out.println("3- Roupa");
        
        int tipoDoProduto = sc.nextInt();
        switch (tipoDoProduto) {
            case 1:
            //add e tal
            break;
            case 2:
            //add e tal
            break; 
            case 3:
            //add e tal
            break; 
            default:
            break;
        }
        case 2:
        System.out.println("Selecione o tipo do produto que você deseja remover:");
        System.out.println("1- Comida");
        System.out.println("2- Eletronico");
        System.out.println("3- Roupa");
        
        tipoDoProduto = sc.nextInt();
        switch (tipoDoProduto) {
            case 1:
            //remover e tal
            break;
            case 2:
            //remover e tal
            break; 
            case 3:
            //remover e tal
            break; 
            default:
            break;
        }
    }
        
        
        
   }
}
