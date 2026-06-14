package desafios;

public class ReproduzirMusica implements IReproduzirMusica{

	@Override
	public void tocar() {
		System.out.println("A música está tocando");
	}

	@Override
	public void pausar() {
		System.out.println("A música está pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("A música selecionada foi: " + musica);
	}

}
