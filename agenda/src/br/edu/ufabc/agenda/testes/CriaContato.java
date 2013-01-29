package br.edu.ufabc.agenda.testes;

import br.edu.ufabc.agenda.modelo.Contato;

public class CriaContato {
	
	public static void main(String[] args) {
		Contato contato = new Contato("André","987654321","andre.martinez@aluno.ufabc.edu.br");
//		contato.setNome("André");
//		contato.setTelefone("9876-5432");
//		contato.setEmail("andre.martinez@aluno.ufabc.edu.br");
		System.out.println(contato.getNome()+"\n"+contato.getTelefone()+"\n"+ contato.getEmail());
	}

}
