package javaapplication4;
import java.util.Scanner;
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String valor;  
        int nota;
        Scanner entrada = new Scanner(System.in);
        nota = entrada.nextInt();
        valor =Integer.toBinaryString(nota);
        System.out.printf("Em binario: %s\n",valor);
        /*String nome;
        System.out.println("Nome: ");
        nome = entrada.nextLine();
        System.out.println("Nota: ");
        nota = entrada.nextFloat();
        System.out.printf("Nome %s  Nota: %.2f",nome,nota);
    */
        
        
        
                }
    
}
