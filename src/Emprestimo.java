public class Emprestimo {
    private final Emprestavel item;
    private StatusEmprestimo status;

    public enum StatusEmprestimo { ATIVO, DEVOLVIDO, ATRASADO }

    public Emprestimo(Emprestavel item) {
        this.item = item;
        this.status = StatusEmprestimo.ATIVO;
    }

    public void devolver() {
        item.devolver();
        status = StatusEmprestimo.DEVOLVIDO;
    }

    public void atrasar() {
        status = StatusEmprestimo.ATRASADO;
    }

    public void mostrarStatus() {
        String mensagem = switch (status) {
            case ATIVO -> "O item ainda está emprestado.";
            case DEVOLVIDO -> "O item foi devolvido.";
            case ATRASADO -> "O item está atrasado!";
        };
        System.out.println(mensagem);
    }
}
