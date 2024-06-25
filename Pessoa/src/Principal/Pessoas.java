package Principal;

public class Pessoas {

	public static void main(String[] args) {
		Fisica fis = new Fisica(); 
		fis.nome = "Miguel";
		fis.cpf = "111.111.111-11";
		fis.identidade = "11.111.111-1";
		fis.situaçaoPessoa = "A";
		
		Juridica jus = new Juridica();
		jus.nome = "Paulo";
		jus.cnpj = "1111111111111111111";
		jus.inscricaoEstadual = "1111111111";
		jus.situaçaoPessoa = "I";
		
		
		System.out.println("Dados pessoa fisica " + fis.toString());
		
		System.out.println("Dados pessoa juridica " + jus.toString());
		
	}

}
