package desafios;

public class AparelhoTelefonico implements IAparelhoTelefonico{

	@Override
	public void ligar(String numero) {
		System.out.println("Você está ligando para o número " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Você atendeu a ligação");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
	}

}
