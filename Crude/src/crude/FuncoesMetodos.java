
package crude;

public class FuncoesMetodos {
    private String nome;
    private String idade;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static void menu(){
       System.out.println("------------------------\n1-Cadastrar\n"
                           + "2-Mostrar cadastros\n3-Excluir\n"
                            + "4-Alterar\n5-Apagar tudo\n6-Sair\n------------------------");
       
    }
}
