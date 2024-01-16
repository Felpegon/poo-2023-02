public class TestaPessoaTelefone {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João");

        Telefone telefone1 = new Telefone("123456789");
        Telefone telefone2 = new Telefone("987654321");
        Telefone telefone3 = new Telefone("555555555");
        Telefone telefone4 = new Telefone("111111111");
        Telefone telefone5 = new Telefone("999999999");

        pessoa.adicionarTelefone(telefone1);
        pessoa.adicionarTelefone(telefone2);
        pessoa.adicionarTelefone(telefone3);
        pessoa.adicionarTelefone(telefone4);
        pessoa.adicionarTelefone(telefone5);

        // Tentativa de adicionar telefone1 novamente (não deve ter efeito)
        pessoa.adicionarTelefone(telefone1);

        System.out.println("Informações da Pessoa: ");
        System.out.println(pessoa);

        // Tentativa de remover telefone3
        pessoa.removerTelefone(telefone3);

        // Tentativa de remover telefone3 novamente (não deve ter efeito)
        pessoa.removerTelefone(telefone3);

        System.out.println("Após a remoção do telefone3: ");
        System.out.println(pessoa);
    }
}
