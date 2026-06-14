package desafios;

public class Iphone {
	
	public static void main(String[] args) {
		
		ReproduzirMusica rm = new ReproduzirMusica();
		AparelhoTelefonico at = new AparelhoTelefonico();
		NavegadorInternet ni = new NavegadorInternet();
		
		rm.tocar();
		at.atender();
		ni.adicionarNovaAba();
	}
}
