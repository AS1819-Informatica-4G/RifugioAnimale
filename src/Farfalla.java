
public class Farfalla extends AnimaleTerrestre implements Volante {

	public Farfalla(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tipo_ali() {
		return "colorate";
	}

	@Override
	public String si_muove() {
		return "volando nei celi con ali " + tipo_ali();
	}
 
	@Override
	public String chi_sei() {
		return "un insetto";
	}

}
