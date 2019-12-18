/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;
import java.util.Scanner;
/**
 *
 * @author Daiane Dias
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        int idade;
        String cidade;
        
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Digite o seu nome:");
            nome = in.nextLine();
            System.out.println("Agora digite sua idade:");
            idade = in.nextInt();
            in.nextLine();
            System.out.println("Por fim informe a sua cidade:");
            cidade = in.next();
        }
       System.out.println("Ola "+nome+", você e natural de "+cidade+" e tem "+idade+" anos.");
    }

    
}
