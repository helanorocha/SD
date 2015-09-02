package NegocioLoc;

public class Filmes {

	private String NomeFilme;
	private String TipoFilme;
	private int QuantidadeFilme;
	private String QuantidadeLotacao;

	public String getNomeFilme() {
		return NomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		NomeFilme = nomeFilme;
	}

	public String getTipoFilme() {
		return TipoFilme;
	}

	public void setTipoFilme(String tipoFilme) {
		TipoFilme = tipoFilme;
	}

	public int getQuantidadeFilme() {
		return QuantidadeFilme;
	}

	public void setQuantidadeFilme(int quantidadeFilme) {
		QuantidadeFilme = quantidadeFilme;
	}

	public String getQuantidadeLotacao() {
		return QuantidadeLotacao;
	}

	public void setQuantidadeLotacao(String quantidadeLotacao) {
		QuantidadeLotacao = quantidadeLotacao;
	}
}