
public abstract class AnimaleTerrestre extends Animale {

	public AnimaleTerrestre(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String vive() {
		return "sulla terraferma";
	}

	@Override
	public String chi_sei() {
		return "un animale terrestre";
	}

}
