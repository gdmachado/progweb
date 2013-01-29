package br.edu.ufabc.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.edu.ufabc.agenda.jdbc.ConnectionFactory;
import br.edu.ufabc.agenda.modelo.Contato;

public class ContatoDAO {
	private Connection connection;
	
	public ContatoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void insere (Contato contato) {
		String query = "insert into contatos (nome, email, endereco) values (?,?,?);";
		try {
			// PreparedStatement para insercao
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, contato.getNome());
			statement.setString(2, contato.getEmail());
			statement.setString(3, contato.getEndereco());
			
			statement.execute();
			statement.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
