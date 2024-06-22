package list.pesquisa;

public class Livro {

    private String Titulo;
    private String Autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
