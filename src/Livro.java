public class Livro implements Emprestavel, Catalogavel {
    private final String titulo;
    private final Autor autor;
    private final Categoria categoria;
    private boolean emprestado;

    public Livro(String titulo, Autor autor, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.emprestado = false;
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("Livro já está emprestado: " + titulo);
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido: " + titulo);
        }
    }

    @Override
    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getCategoria() {
        return categoria.nome();
    }
}
