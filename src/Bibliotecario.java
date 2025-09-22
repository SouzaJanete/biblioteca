public final class Bibliotecario implements PerfilUsuario {
    @Override
    public String gerarRelatorio() {
        return """
            Relatório do Bibliotecário:
            - Itens emprestados
            - Itens atrasados
            - Usuários ativos
            """;
    }
}
