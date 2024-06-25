package Principal;

public class Juridica extends Pessoa{
	public String cnpj, inscricaoEstadual;

	@Override
	public String toString() {
		return "Juridica [cnpj=" + cnpj + ", inscricaoEstadual=" + inscricaoEstadual + "]";
	}
	
	
}
