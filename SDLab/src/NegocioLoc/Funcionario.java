package NegocioLoc;

public class Funcionario extends Pessoa {

	long lotacao;

	public Funcionario() {

	}

	@Override
	public String toString() {
		return this.getNome() + "#" + this.getLotacao();
	}

}
