package br.edu.ufabc.agenda.testes;

import java.sql.Connection;

import br.edu.ufabc.agenda.jdbc.ConnectionFactory;
import br.edu.ufabc.agenda.modelo.Contato;

public class CriaContato {
	
	public static void main(String[] args) {	
		
		Contato contato = new Contato();
		contato.setNome("André");
		contato.setEndereco("9876-5432");
		contato.setEmail("andre.martinez@aluno.ufabc.edu.br");
		System.out.println(contato.getNome()+"\n"+contato.getEndereco()+"\n"+ contato.getEmail());
		
		
		// Testa conexao
		/*
		try {
			Connection connection = new ConnectionFactory().getConnection();
			System.out.println("Conexao estabelecida");
			
			connection.close();
			System.out.println("Conexao fechada");
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
	}

}
