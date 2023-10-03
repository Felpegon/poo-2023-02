public class Livro {
    private String titulo;
    private String autor;
    private String ano;
    private String editora;

    public Livro(String titulo, String autor, String ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAno: " + ano + "\nEditora: " + editora;
    }
}