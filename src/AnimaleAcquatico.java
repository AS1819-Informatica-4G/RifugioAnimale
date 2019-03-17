public abstract class AnimaleAcquatico extends Animale implements Natante {
	
	public AnimaleAcquatico(String nome) {
		super(nome);
	}

	@Override
	public String respira() {
		return "con polmoni con le branchie";
	}
	
	@Override
	public String vive() {
		return "nell'acqua";
	}

	@Override
	public String chi_sei() {
		return "un animale acquatico";
	}

}
