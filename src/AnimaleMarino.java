
public abstract class AnimaleMarino extends AnimaleAcquatico {

	public AnimaleMarino(String nome) {
		super(nome);
		super.verso="muto";
	}
	@Override
	public String vive() {
		return super.vive()+ " di mare";
	}
	@Override
	public String chi_sei() {
		return "un animale marino";
	}
}
