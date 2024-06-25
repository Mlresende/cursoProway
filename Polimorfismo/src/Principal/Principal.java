package Principal;

public class Principal {
	public static void main(String[] args) {
		Mamifero mamifero1 = new Elefante();
		Mamifero mamifero2 = new Rato();
		
		System.out.println("Cota diaria de leite do Elefante: " + mamifero1.cotaDiariaLeite());
		System.out.println("Cota diaria de leite do Rato: " + mamifero2.cotaDiariaLeite());
		
		
	}
}
