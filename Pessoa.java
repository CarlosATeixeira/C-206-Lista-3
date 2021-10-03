import java.util.ArrayList;

public class Pessoa {
    public String nome;
    public int cpf;

    private int qtdEnd;
    public ArrayList<Endereco> enderecos;

    public Pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        this.qtdEnd = qtdEnd;

        enderecos = new ArrayList<Endereco>();
    }

    public void addEndereco(Endereco end){
        if(enderecos.size() < qtdEnd){
            enderecos.add(end);
        }
    }

    public void mostraInfo(){
        System.out.print("Nome: ");
        System.out.println(nome);
        System.out.print("CPF: ");
        System.out.println(cpf);

        for(Endereco end : enderecos){
            System.out.print(end.rua);
            System.out.print(", ");
            System.out.print(end.num);
            System.out.print(", ");
            System.out.println(end.bairro);
        }
    }
}
