public class Main {
    public static void main(String[] args) {
        var autor = new Autor("Machado de Assis", "Brasileiro");
        var categoriaRomance = new Categoria("Romance");
        var categoriaCiencia = new Categoria("Ciência");

        var livro = new Livro("Dom Casmurro", autor, categoriaRomance);
        var revista = new Revista("Ciência Hoje", categoriaCiencia);

        var emprestimoLivro = new Emprestimo(livro);
        var emprestimoRevista = new Emprestimo(revista);

        livro.emprestar();
        revista.emprestar();

        emprestimoLivro.mostrarStatus();
        emprestimoRevista.mostrarStatus();

        ProcessarEmprestimo.processar(livro);
        ProcessarEmprestimo.processar(revista);

        var bibliotecario = new Usuario("João", new Bibliotecario());
        var usuarioComum = new Usuario("Maria", new UsuarioComum());

        bibliotecario.mostrarRelatorio();
        usuarioComum.mostrarRelatorio();
    }
}
