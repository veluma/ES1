public class Coima {
    private String descricao;
    private float valor;
    private Devolucao devolucao;

    public Coima(String descricao, float valor, Devolucao devolucao) {
        this.descricao = descricao;
        this.valor = valor;
        this.devolucao = devolucao;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public Devolucao getDevolucao() {
        return devolucao;
    }
}
