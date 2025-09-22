public class ProcessarEmprestimo {

    public static void processar(Emprestavel item) {
        if (item instanceof Livro livro) {
            System.out.println("""
                Processando empréstimo de Livro:
                Título: %s
                Categoria: %s
                Autor: %s
                """.formatted(livro.getTitulo(), livro.getCategoria(), livro.getCategoria()));
        } else if (item instanceof Revista revista) {
            System.out.println("""
                Processando empréstimo de Revista:
                Título: %s
                Categoria: %s
                """.formatted(revista.getTitulo(), revista.getCategoria()));
        }
    }
}
