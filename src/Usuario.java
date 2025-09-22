public class Usuario {
    private final String nome;
    private final PerfilUsuario perfil;

    public Usuario(String nome, PerfilUsuario perfil) {
        this.nome = nome;
        this.perfil = perfil;
    }

    public void mostrarRelatorio() {
        System.out.println("Usuário: " + nome);
        System.out.println(perfil.gerarRelatorio());
    }
}
