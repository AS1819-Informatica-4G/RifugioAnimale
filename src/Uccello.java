
public class Uccello extends AnimaleTerrestre implements Volante {

	public Uccello(String nome) {
		super(nome);
		verso="cinguetta";
	}

	@Override
	public String tipo_ali() {
		return "dotate di piume";
	}

	@Override
	public String si_muove() {
		return "volando nei celi con ali " + tipo_ali();
	}
	@Override
	public String chi_sei() {
		return "un uccello";
	}
}
