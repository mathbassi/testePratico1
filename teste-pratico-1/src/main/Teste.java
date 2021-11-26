package main;

import Classes.Cliente;
import Classes.Conta;
import Classes.Recarga;
import Classes.Telefone;

public class Teste {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Telefone tel1 = new Telefone();
		Cliente client1 = new Cliente();
		conta1.setRecarga(15);
		conta1.setSaldo(30);
		tel1.setNumeroLinha("11999999999");
		tel1.setSaldo(5);
		client1.setNome("Matheus");
		client1.setConta(conta1);
		client1.setLinha(tel1);
		
		System.out.println("--------Teste com sucesso--------");
		System.out.println(new Recarga().realizaRecarga(client1));
		System.out.println("saldo da conta após transação: "+ conta1.getSaldo() +"\n"
				+ "saldo do telefone após transação: "+ tel1.getSaldo());
		
		System.out.println("--------realizando recarga novamente para verificar soma e subtração dos saldos--------");
		System.out.println(new Recarga().realizaRecarga(client1));
		System.out.println("saldo da conta após transação: "+ conta1.getSaldo() +"\n"
				+ "saldo do telefone após transação: "+ tel1.getSaldo());
		
		System.out.println("--------saldo insuficiente--------");
		System.out.println(new Recarga().realizaRecarga(client1));
		System.out.println("saldo da conta após transação: "+ conta1.getSaldo() +"\n"
				+ "saldo do telefone após transação: "+ tel1.getSaldo());
		
		System.out.println("--------cliente com número de telefone inválido--------");
		tel1.setNumeroLinha("0");
		System.out.println(new Recarga().realizaRecarga(client1));
		System.out.println("saldo da conta após transação: "+ conta1.getSaldo() +"\n"
				+ "saldo do telefone após transação: "+ tel1.getSaldo());
		
		
		
		
		

	}

}
