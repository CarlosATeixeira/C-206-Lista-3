public class Program{
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Albert Einstein", 1234567890, 5);

        pessoa.addEndereco(new Endereco("Santa Fé", "Centro", 12));
        pessoa.addEndereco(new Endereco("Santo Antonio", "Jardim dos Palmares", 312));
        pessoa.addEndereco(new Endereco("Guaratinguetá", "Rodoviaria", 220));

        pessoa.mostraInfo();
    }
}