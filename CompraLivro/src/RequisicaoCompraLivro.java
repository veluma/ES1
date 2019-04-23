import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra {

        private PropostaAquisicao propostaAquisicao;

        public RequisicaoCompraLivro(String estado, LocalDate data, String oficio, PropostaAquisicao propostaAquisicao, Livro livro, Utilizador utilizador) {
            super(estado,data,oficio,livro,utilizador);
            this.propostaAquisicao = propostaAquisicao;
        }

        public PropostaAquisicao getPropostaAquisicao() {
            return propostaAquisicao;
        }

}
