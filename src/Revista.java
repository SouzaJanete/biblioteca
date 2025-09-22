public class Revista implements Emprestavel, Catalogavel {
    private final String titulo;
    private final Categoria categoria;
    private boolean emprestado;

    public Revista(String titulo, Categoria categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.emprestado = false;
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Revista emprestada: " + titulo);
        } else {
            System.out.println("Revista já está emprestada: " + titulo);
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Revista devolvida: " + titulo);
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
