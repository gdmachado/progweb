package br.edu.ufabc.agenda.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection() {
		System.out.println("Conectando ao bd...");
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/progwebdb", "ufabc", "ufabc");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
