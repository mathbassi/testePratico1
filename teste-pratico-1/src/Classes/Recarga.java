package Classes;

public class Recarga {
	
	//m�todo retornar� true somente se a transa��o for um sucesso
	public boolean realizaRecarga(Cliente cliente) {
		if (cliente.getTelefone().getNumeroLinha().length()==11) {
			if(cliente.getConta().getSaldo() >= cliente.getConta().getRecarga()) {
				int saldoContaFinal = cliente.getConta().getSaldo() - cliente.getConta().getRecarga();
				int saldoTelefoneFinal = cliente.getTelefone().getSaldo() + cliente.getConta().getRecarga();
				cliente.getConta().setSaldo(saldoContaFinal);
				cliente.getTelefone().setSaldo(saldoTelefoneFinal);
				System.out.println("Transa��o realizada com sucesso!");
				return true;
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("N�mero de telefone inv�lido");
		}
		return false;
	}

}
