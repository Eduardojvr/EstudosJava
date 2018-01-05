
package funcdinam;

import java.util.Scanner;

public class Objeto {
    String nome;
    int idade;    
    
    public static String insNome(){
       String n;
        System.out.println("Nome");
        Scanner ler = new Scanner(System.in);
        n = ler.nextLine();
        return n;
    }
 
   public static int insIdade(){
       int n;
        System.out.println("Idade");
        Scanner ler = new Scanner(System.in);
        n = Integer.parseInt(ler.nextLine());
        return n;
    }
 
 
    
}
  
 