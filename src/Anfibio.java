
public class Anfibio extends AnimaleTerrestre implements Natante {

	public Anfibio(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String respira() {
		return "con polmoni ma sta sott'acqua in apnea";
	}

	@Override
	public String si_muove() {
		return "sulla terraferma e respire "+respira();
	}
}
