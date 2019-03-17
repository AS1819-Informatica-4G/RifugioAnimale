
public class PesceDiMare extends AnimaleMarino {

	public PesceDiMare(String nome) {
		super(nome);
		
	}
	@Override
	public String si_muove() {
		return "nuotando";
	}
	@Override
	public String chi_sei() {
		return "un pesce di mare";
	}
}
