import java.util.Scanner;

public class Ex17 {
	public class void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite o nome do funcionario: ");
	String nome = scanner.nextLine();
	
	System.out.print("Digite o salario atual do funcionario: ");
	double salarioAtual = scanner.nextDouble();
	
	System.out.print("Digite o valor do salario minimo: ");
	double salarioMinimo = scanner.nextDouble();
	
	double novoSalario;
	if(salarioAtual < 3 * salarioMinimo) {
		novoSalario = salarioAtual * 1.50;
	} else if (salarioAtual <= 10 * salarioMinimo) {
       novoSalario = salarioAtual * 1.15;
	} else if (salarioAtual <= 20 * salarioMinimo) { 
	} else {
       novoSalario = salarioAtual * 1.10;		
	}
	
	double reajuste = novoSalario - salarioAtual;
	
	System.out.println("Funcionario: " + nome);
	System.out.println ("Reajuste: R$" + reajuste);
	System.out.println ("Novo salario: R$ " + novoSalario);
	
	scanner.close();
	
	}
    
}
