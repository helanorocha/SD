package NegocioLoc;

public class Estoque extends Filmes {

	public Estoque() {

	}

	@Override
	public String toString() {
		return this.getNomeFilme() + "#" + this.getTipoFilme() + "#" + this.getQuantidadeFilme();
	}
}
