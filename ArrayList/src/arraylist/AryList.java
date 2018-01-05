
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AryList {

  
    public static void main(String[] args) {    
        String nome,idade,cpf;
        boolean g=false;
        int op;
        Scanner e = new Scanner(System.in);
      
        ArrayList <ClassPessoa> pessoas = new ArrayList();
 
        do {
            System.out.println("1-Inserir\n2-Mostrar\n3-Pesquisar\n4-Alterar\n5-Quantidade de cadastros\n6-Sair");
            op = Integer.parseInt(e.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Nome");
                    nome= e.nextLine();
                    System.out.println("idade");
                    idade=e.nextLine();
                    System.out.println("cpf");
                    cpf=e.nextLine();
                    ClassPessoa pessoa  = new ClassPessoa(nome,idade,cpf);
                    pessoas.add(pessoa);
                    break;
                case 2:
                    for (ClassPessoa p : pessoas) {
                       System.out.println(p.getNome()+" "+p.getIdade()+" "+p.getCpf()+" ");
                    }
                    break;
                case 3:
                    System.out.println("Nome que deseja pesquisar ");
                    nome = e.nextLine();
                     for (ClassPessoa q : pessoas) {
                       if(q.getNome().equalsIgnoreCase(nome)){
                           g=true;
                       }else{
                           g=false;
                       }               
                    }
                    if (g == true) {
                        System.out.println("Nome encontrado");
                    }else{
                        System.out.println("Nome não encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Nome da pessoa que deseja alterar");
                    nome = e.nextLine();
                    String novo;
                    for (ClassPessoa b : pessoas) {
                        if(b.getNome().equalsIgnoreCase(nome)){
                            System.out.println("Novo nome");
                                novo = e.nextLine();                           
                                    b.setNome(novo);
                            
                            System.out.println("Nova idade");
                                novo = e.nextLine();
                                    b.setIdade(novo);
                            System.out.println("Novo Cpf");
                                novo = e.nextLine();
                                    b.setCpf(novo);
                        }
                    }
                    break;
                case 5:
                    System.out.printf("Quantidade de pessoas cadastradas:\n");
                    int qtd = pessoas.size();
                    System.out.println(qtd);
                    break;
                default:
                    break;
            }
        } while (op!=6);
    }
    
}
