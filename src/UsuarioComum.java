public final class UsuarioComum implements PerfilUsuario {
    @Override
    public String gerarRelatorio() {
        return """
            Relatório do Usuário Comum:
            - Itens que possui emprestados
            - Prazos de devolução
            """;
    }
}
