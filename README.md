# Fundamentos JAVA

## Tipo de dados

```java
	//Demonstração de alguns tipos de dados
	int numeroSemDecimal;
	float decimalCurto;
	double decimalLongo;
	char unicoCaracter;
	String cadeiaCaracteres;
	
	
	numeroSemDecimal = 10;
	decimalCurto = 10.5f;
	decimalLongo = 20.5;
	unicoCaracter = 'c';
	cadeiaCaracteres = "** Meu curso Java em fundamentos em 2024 **";
```

## Variáveis

São áreas de memorias sendo ocupadas e não devemos criar variáveis de forma descriminadas e tão pouco ignorar a questão de dimensionamento correto delas. Devemos ocupar a quantidade de memoria necessária, nem mais e nem menos.

---

# Literais

É aquilo que você atribui a uma variável.

```java
package ClassePrincipal;

public class Literal {

	public static void main(String[] args) {
		int numero;
		String cadeiaCaracter;
		char caracter;
		boolean certoOuErrado;
		
		numero = 10;
		cadeiaCaracter = "Miguel Luis Resende";
		caracter = 'S';
		certoOuErrado = true;
		
		System.out.println("O valor de numero é : " + numero);
		System.out.println("O valor de cadeia de caracteres é : " + cadeiaCaracter);
		System.out.println("O valor de caracter é : " + caracter);
		System.out.println("O valor de certo ou errado é : " + certoOuErrado);
		

	}

}

```

---

## Operadores Aritméticos

Os operadores aritméticos em Java são utilizados para realizar operações matemáticas básicas.

Os principais operadores são:

- `+` (adição)
- `-` (subtração)
- `*` (multiplicação)
- `/` (divisão)
- `%` (resto da divisão)

Exemplo:

```java
int num1 = 10;
int num2 = 2;

int soma = num1 + num2; // resultado: 12
int subtracao = num1 - num2; // resultado: 8
int multiplicacao = num1 * num2; // resultado: 20
int divisao = num1 / num2; // resultado: 5
int resto = num1 % num2; // resultado: 0

System.out.println("Soma: " + soma);
System.out.println("Subtração: " + subtracao);
System.out.println("Multiplicação: " + multiplicacao);
System.out.println("Divisão: " + divisao);
System.out.println("Resto da divisão: " + resto);

```

---

## Estrutura Condicional

As estruturas condicionais em Java são usadas para tomar decisões no código, dependendo de determinadas condições. Se a condição for verdadeira, um bloco de código será executado. Se for falsa, outro bloco de código será executado.

### If Statement

A estrutura condicional 'if' executa um bloco de código, se a condição for verdadeira. Veja o exemplo abaixo:

```java
int numero = 10;

if (numero > 5) {
    System.out.println("O número é maior que 5");
}

```

Neste exemplo, a mensagem "O número é maior que 5" será impressa, porque a condição (numero > 5) é verdadeira.

### If-Else Statement

A estrutura condicional 'if-else' executa um bloco de código se a condição for verdadeira e outro bloco se a condição for falsa. Veja o exemplo abaixo:

```java
int numero = 10;

if (numero > 15) {
    System.out.println("O número é maior que 15");
} else {
    System.out.println("O número não é maior que 15");
}

```

Neste exemplo, a mensagem "O número não é maior que 15" será impressa, porque a condição (numero > 15) é falsa.

### Switch Statement

A estrutura condicional 'switch' seleciona um entre muitos blocos de código a serem executados. Veja o exemplo abaixo:

```java
int dia = 3;

switch (dia) {
  case 1:
    System.out.println("Segunda-feira");
    break;
  case 2:
    System.out.println("Terça-feira");
    break;
  case 3:
    System.out.println("Quarta-feira");
    break;
  // Você pode ter qualquer número de casos de 'case' abaixo.
  default:
    System.out.println("Dia inválido");
}

```

Neste exemplo, a mensagem "Quarta-feira" será impressa, porque o valor da variável 'dia' é 3.

---

## Estruturas de Repetição

As estruturas de repetição, também conhecidas como laços ou loops, são usadas para executar um bloco de código várias vezes. A quantidade de vezes que o código será executado depende da condição que foi estabelecida para o laço.

Existem três principais tipos de estruturas de repetição em Java: `for`, `while` e `do-while`.

### For Loop

A estrutura de repetição 'for' é usada quando sabemos a quantidade exata de vezes que queremos que um bloco de código seja executado.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

```

Neste exemplo, o código dentro do bloco `for` será executado 5 vezes. A cada repetição, o valor de `i` é incrementado em 1, e o valor atual de `i` é impresso.

### While Loop

A estrutura de repetição 'while' é usada quando queremos que um bloco de código seja executado enquanto uma condição for verdadeira.

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

```

Neste exemplo, o código dentro do bloco `while` será executado enquanto o valor de `i` for menor que 5. A cada repetição, o valor de `i` é incrementado em 1, e o valor atual de `i` é impresso.

### Do-While Loop

A estrutura de repetição 'do-while' é semelhante ao 'while', mas com uma diferença fundamental: o bloco de código será executado pelo menos uma vez, pois a condição é verificada após a execução do bloco.

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);

```

Neste exemplo, o código dentro do bloco `do-while` será executado enquanto o valor de `i` for menor que 5. A cada repetição, o valor de `i` é incrementado em 1, e o valor atual de `i` é impresso.

---

# Entrada de dados

Entraremos com os dados através de uma janela e exibiremos as informações concedidas utilizando o JOptionPane. No contexto do código fornecido, o método Integer.parseInt é usado para converter a entrada do usuário, que é recebida como uma string através do JOptionPane.showInputDialog, em um número inteiro que pode ser atribuído à variável 'idade'.

```java
package ClassPrincipal;

import javax.swing.JOptionPane;

public class Dados {

	public static void main(String[] args) {
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Indicque sua idade: "));
		
		//System.out.println(idade);
		
		JOptionPane.showMessageDialog(null, "Voce informou que tem " + idade + " anos");
	}

}

```

}

---

## Orientações a Objeto

Classe - É um elemento de um projeto que consegue expressar em variáveis oq eu tenho no mundo real. Vai existir as declarações de variáveis, os construtores até que ela se torne viva, um texto. não é um objeto.

Método - Uma forma de fazer algo.

Atributo - Contem informações inerentes a classe. Vão se tornar futuramente em uma coluna no banco de dados.

Instanciação - Criar um objeto.

Encapsulamento - Blindar os atributos dentro da classe, para que outra classe externa não consiga enxergar a variável original

Herança - herdar alguns atributos de outra classe.

Polimorfismo é um conceito fundamental na programação orientada a objetos (POO) que permite que objetos de diferentes classes sejam tratados como objetos de uma classe comum. Mais especificamente, refere-se à capacidade de diferentes classes responderem de maneira diferente à mesma mensagem (ou método).

