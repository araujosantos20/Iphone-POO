package desafios;

public class NavegadorInternet implements INavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		System.out.println("Você está exibindo a página do link " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada com sucesso");
	}

}
