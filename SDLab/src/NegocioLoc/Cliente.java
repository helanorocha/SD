package NegocioLoc;

public class Cliente extends Pessoa {

	float SaldoDevedor;

	public Cliente() {

	}

	@Override
	public String toString() {
		return this.getNome() + "#" + this.getId();
	}
}
