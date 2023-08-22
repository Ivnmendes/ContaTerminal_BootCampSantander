package application;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int accountNumber;
		double balance;
		String agencyNumber, clientName;
		
		System.out.println("Bem vindo ao sistema bancario!");
		System.out.print("Digite o numero da agencia (xxx-x): ");
		agencyNumber = sc.next();
		System.out.print("Digite o numero da conta (xxxx): ");
		accountNumber = sc.nextInt();
		System.out.print("Digite o nome do cliente: ");
		sc.nextLine();
		clientName = sc.nextLine();
		System.out.print("Digite o seu saldo: ");
		balance = sc.nextDouble();
		
		System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco sua agencia e %s, conta %d e seu saldo R$%.2f ja esta disponivel para saque.", clientName, agencyNumber, accountNumber, balance);
				
		sc.close();
	}

}
