import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Telefone> telefones;

    public Pessoa(String nome) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Telefone> getTelefones() {
        return new ArrayList<>(telefones); // Retorna uma cópia da lista para evitar manipulações externas
    }

    public boolean adicionarTelefone(Telefone telefone) {
        if (!telefones.contains(telefone)) {
            telefones.add(telefone);
            return true;
        }
        return false;
    }

    public boolean removerTelefone(Telefone telefone) {
        return telefones.remove(telefone);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                '}';
    }
}
