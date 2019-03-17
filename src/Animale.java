
public abstract class Animale {
	private String nome;
	protected String verso;
	public Animale(String nome) {
		this.nome=nome;
	}
	public abstract String si_muove();
	public abstract String vive();
	public abstract String chi_sei();
	@Override
	public String toString() {
		return nome + " "+ chi_sei() + " si muove " + si_muove() + " e vive "+ vive();
	}
}
