package br.com.cadastro.main;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import br.com.cadastro.model.Jogador;
import br.com.cadastro.negocio.JogadorImpl;

public class Principal {
	public static void main(String[] args) throws IOException {
		Principal p = new Principal();
		JogadorImpl jogImpl = new JogadorImpl();
		
		String enderecoDir = ("E:\\Thiago\\SPREAD\\GITHUB\\Java8_oracle\\src\\");
		String nomeArquivo = "lista.txt";
		List<Jogador> listaDeJogadores = jogImpl.getListaDeJogadores(Paths.get(enderecoDir + "\\" + nomeArquivo));
		
		if(!jogImpl.verificarArquivoExiste(Paths.get(enderecoDir))) {
			System.out.println("Arquivo não encontrado");
		}
			else {
				jogImpl.imprimirJogadorArtilheiro(listaDeJogadores);
				jogImpl.imprimirJogadoresMaisVelhos(listaDeJogadores);
				jogImpl.imprimirJogadorMaisNovo(listaDeJogadores);
			}
		
		
	}

}
