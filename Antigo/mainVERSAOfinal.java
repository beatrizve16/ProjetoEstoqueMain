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
        System.out.println("Sistema de Estoque!");
        System.out.println("O primeiro uso desse sistema possui o estoque zerado, ou seja, deve-se adicionar os produtos antes para poder utilizar das funcionalidades.");
    do{
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
        int tipoDoProduto;
        do { 
        System.out.println("Selecione o tipo do produto que voce deseja transicionar (Adicionar/Retirar quantidade de produto especifico):");
        System.out.println("1- Comida");
        System.out.println("2- Eletronico");
        System.out.println("3- Roupa");
        

        tipoDoProduto = sc.nextInt();
        
        switch (tipoDoProduto) {
            case 1:
                int tipoDeTransacao ;
                System.out.println("Voce deseja adicionar ou retirar desse produto? (1- Adicionar, 2- Retirar)");
                do{
                tipoDeTransacao = sc.nextInt();
                
                    switch (tipoDeTransacao) {
                        case 1:
                            System.out.println("Digite a quantidade que deseja adicionar");
                            int adicaoComida = sc.nextInt();
                            // ComidaObjeto.quantidade += adicaoRoupa;
                            System.out.println("A quantidade de +ComidaObjeto+ agora é: ComidaObjeto.quantidade");
                            break;
                            
                            case 2:
                            System.out.println("Digite a quantidade que deseja retirar");
                            int retirarComida = sc.nextInt();
                            // ComidaObjeto.quantidade += retirarRoupa;
                            System.out.println("A quantidade de +ComidaObjeto+ agora é: ComidaObjeto.quantidade");
                            break;

                        default:
                            System.out.println("Nenhuma opcao escolhida! Tente novamente");
                            break;
                }
            }
            while (tipoDeTransacao > 2 || tipoDeTransacao < 1);                
            break;
            case 2:
                System.out.println("Voce deseja adicionar ou retirar desse produto? (1- Adicionar, 2- Retirar)");
                tipoDeTransacao = sc.nextInt();
                do{ 
                    switch (tipoDeTransacao) {
                        case 1:
                            System.out.println("Digite a quantidade que deseja adicionar");
                            int adicaoEletronico = sc.nextInt();
                            // EletronicoObjeto.quantidade += adicaoRoupa;
                            System.out.println("A quantidade de +EletronicoObjeto+ agora é: EletronicoObjeto.quantidade");
                            break;

                        case 2:
                            System.out.println("Digite a quantidade que deseja retirar");
                            int retirarEletronico = sc.nextInt();
                            // EletronicoObjeto.quantidade -= retirarRoupa;
                            System.out.println("A quantidade de +EletronicoObjeto+ agora é: EletronicoObjeto.quantidade");
                            break;

                        default:
                            System.out.println("Nenhuma opcao escolhida");
                            break;
                }
                break;
                }
                while (tipoDeTransacao>2|| tipoDeTransacao<0);
                break;
            case 3:
                System.out.println("Voce deseja adicionar ou retirar desse produto? (1- Adicionar, 2- Retirar)");
                tipoDeTransacao = sc.nextInt();
                do{ 
                    switch (tipoDeTransacao) {
                        case 1:
                            System.out.println("Digite a quantidade que deseja adicionar");
                            int adicaoRoupa = sc.nextInt();
                            // RoupaObjeto.quantidade += adicaoRoupa;
                            System.out.println("A quantidade de +RoupaObjeto+ agora é: RoupaObjeto.quantidade");

                            break;

                        case 2:
                            System.out.println("Digite a quantidade que deseja retirar");
                            int retirarRoupa = sc.nextInt();
                            // RoupaObjeto.quantidade -= retirarRoupa;
                            System.out.println("A quantidade de +RoupaObjeto+ agora é: RoupaObjeto.quantidade");
                            break;
                        default:
                            System.out.println("Nenhuma opcao escolhida! Tente Novamente");
                            break;
                    }
                }
                while (tipoDeTransacao>2|| tipoDeTransacao<0);     
            default:
            System.out.println("Nenhuma opcao escolhida! Tente novamente");
            break;                
        }
    }
    while (tipoDoProduto > 3 || tipoDoProduto < 0);
    }


    private static void consultarEstoque(Scanner sc) {
        System.out.println("Selecione o tipo do produto que voce deseja consultar o estoque:");
        System.out.println("1- Comida");
        System.out.println("2- Eletronico");
        System.out.println("3- Roupa");

        int tipoDoProduto = sc.nextInt();
        
        do{ 
            switch (tipoDoProduto) {
                case 1:
                    System.out.println("Digite o id da comida a ser consultada");
                    int idComidaConsulta = sc.nextInt();
                    //arrayDeObejtos[idComida]
                    break;
                case 2:
                    System.out.println("Digite o id do eletronico a ser consultado");
                    int idEletronicoConsulta = sc.nextInt();
                    break;

                case 3:
                    System.out.println("Digite o id da roupa a ser consultada");
                    int idRoupaConsulta = sc.nextInt();
                    break;

            default:
                System.out.println("Nenhuma opcao escolhida");
                break;
            }
        }
        while(tipoDoProduto > 3 || tipoDoProduto < 1);
    }

   private static void gerenciarProduto(Scanner sc) {

    System.out.println("Voce deseja 1-adicionar ou 2-remover?:");
    int escolha;
    do{
        escolha = sc.nextInt();
        switch (escolha) {
            case 1:
            System.out.println("Selecione o tipo do produto que você deseja adicionar:");
            System.out.println("1- Comida");
            System.out.println("2- Eletronico");
            System.out.println("3- Roupa");
            
            int tipoDoProduto ;
            do{
                tipoDoProduto = sc.nextInt();
                switch (tipoDoProduto) {
                    case 1:
                    //add e tal
                    System.out.println("Comida adicionada! Ultilize o sistema de transações, consultas e gerenciamento para modifica-la");
                    break;
                    case 2:
                    //add e tal
                    System.out.println("Eletronico adicionado! Ultilize o sistema de transações, consultas e gerenciamento para modifica-lo");
                    break; 
                    case 3:
                    //add e tal
                    System.out.println("Roupa adicionado! Ultilize o sistema de transações, consultas e gerenciamento para modifica-la");
                    break; 
                    default:
                    System.out.println("Nenhuma opcao escolhida");
                    break;
                }
            }
            while (tipoDoProduto > 3 || tipoDoProduto < 1);
            break;
            case 2:
            System.out.println("Selecione o tipo do produto que você deseja remover:");
            System.out.println("1- Comida");
            System.out.println("2- Eletronico");
            System.out.println("3- Roupa");
            
            do{ 
                tipoDoProduto = sc.nextInt();
                switch (tipoDoProduto) {
                    case 1:
                    //remover e tal
                    System.out.println("Comida removida! Ultilize o sistema de gerenciamento para adicionar uma nova");
                    break;
                    case 2:
                    //remover e tal
                    System.out.println("Eletronico removido! Ultilize o sistema de gerenciamento para adicionar um novo");
                    break; 
                    case 3:
                    //remover e tal
                    System.out.println("Roupa removida! Ultilize o sistema de gerenciamento para adicionar uma nova");
                    break; 
                    default:
                    System.out.println("Nenhuma opcao escolhida! Tente Novamente.");
                    break;
                }
            }
            while (tipoDoProduto>3||tipoDoProduto<0);
                break;
            default:
                System.out.println("Nenhuma opcao escolhida! Tente Novamente.");
                break;
        }
    }
    while (escolha > 3 || escolha < 1);
   }
}
