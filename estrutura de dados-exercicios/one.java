package exercicios.estrutura_dados;

import java.util.Scanner;
import java.util.ArrayList;
public class one {
    public static <Lista> void main(String[] args) {

        //lista de contatos
        //Array List

        Scanner ctt = new Scanner(System.in);

        int op;

        Lista lista =new Lista();
        ArrayList<Lista>contatos = new ArrayList<>();

        //ArrayList<String> contacts = new ArrayList<String>(); // Create an ArrayList object
        //contacts.add("Contact:");
        //contacts.add(ctt.next());
        //contacts.get( 0);


        System.out.println("Menu:");
        System.out.println("[0]Adicionar Contato");
        System.out.println("[1]Remover Contato");
        System.out.println("[2]Atualizar Contato");
        System.out.println("[3]Pesquisar contatos");
        System.out.println("[4]Ver contatos salvos");
        System.out.println("[5]Sair");
        System.out.println("Escolha a opção:");
        op = Integer.parseInt(ctt.nextLine());




    }
}








//https://www.devmedia.com.br/forum/arraylist-inserir-lista-dentro-de-outra-lista/604451
//https://blog.algaworks.com/entendendo-o-equals-e-hashcode/
