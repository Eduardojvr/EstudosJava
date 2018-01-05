
package funcdinam;
import java.util.Scanner;

    
public class FuncDinam {

    public static void main(String[] args) {
       int c=0,i;
       Scanner entrada = new Scanner(System.in);
       Objeto pessoa[] = new Objeto[20];

        do {
            System.out.print("1-Inserir\n2-Mostrar\n3-sair");
            i = Integer.parseInt(entrada.nextLine());
            switch (i) {
                case 1:
                    pessoa[c] = new Objeto();
                    pessoa[c].nome = Objeto.insNome();
                    c+=1;
                    break;
                case 2:
                    for(int m=0;m<c;m++){
                        System.out.println(pessoa[m].nome);
                    }           break;
                default:
                    break;
            }
        } while (i!=3);

    }
    
}
