
package crude;

import java.util.ArrayList;
import java.util.Scanner;


public class Crude {
    
    public static void main(String[] args) {
        int op;
        Scanner teclado = new Scanner(System.in);
        String n,s;
        ArrayList <FuncoesMetodos> cadastro = new ArrayList();
               do{
                 FuncoesMetodos.menu();
                 op = Integer.parseInt(teclado.nextLine());
                 
            switch (op) {
                case 1:
 
                    FuncoesMetodos pessoas = new FuncoesMetodos();

                    System.out.println("Nome: ");
                    n = teclado.nextLine();
                    pessoas.setNome(n);
               
                    System.out.println("Idade");
                    n = teclado.nextLine();
                    pessoas.setIdade(n);
                    
                    System.out.println("cpf");
                    n = teclado.nextLine();
                    pessoas.setCpf(n);
                    
                    cadastro.add(pessoas);

                    break;
                    
                case 2:
                
                    for (FuncoesMetodos d : cadastro) {
                        if(d.getNome() != null)
                        System.out.println(d.getNome()+" "+d.getIdade()+" "+d.getCpf());
                    }
                    break;
                    
                case 3:
                    
                     System.out.println("Nome que deseja excluir");
                     n = teclado.nextLine();
                     if(cadastro.isEmpty()){
                         System.out.println("Lista Vazia");
                     }
                     for (FuncoesMetodos b : cadastro ) {
                        if(b.getNome().equalsIgnoreCase(n)){
                            b.setCpf(null);
                            b.setIdade(null);
                            b.setNome(null);
                        }else{
                            System.out.println("Nome não encontrado!");
                        }
                    }
                    break;
                    
                case 4:
                    
                    System.out.println("Digite o nome que deseja alterar:");
                    n = teclado.nextLine();
                    if(cadastro.isEmpty()){
                        System.out.println("Lista vazia!");
                    }
                    for (FuncoesMetodos a : cadastro) {
                        if(a.getNome().equalsIgnoreCase(n)){
                            System.out.println("Digite os novos dados\n");
                            a.setNome(n);
                            
                            System.out.println("Idade");
                            n=teclado.nextLine();
                            a.setIdade(n);
                            
                            System.out.println("Cpf");
                            n=teclado.nextLine();
                            a.setCpf(n);
                        }else{
                            System.out.println("Nome inexistente!");
                        }
                    }
                    break;
                    
                case 5:
                    
                    System.out.println("Tem Certeza que deseja apagar tudo? [S/N]");
                    s = teclado.nextLine();
                   if(s.equalsIgnoreCase("S")){
                        cadastro.removeAll(cadastro);
                        System.out.println("Registros apagados com sucesso!");
                   }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
               }while(op != 6); 

    }
}
