package br.com.javalab.singleton;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
	
    private static ConnectionFactory instance;
    private Connection connection;

    // construtor da classe privado para evitar que outros objetos criem instâncias
//    private ConnectionFactory() {
//        try {
//            connection = DriverManager.getConnection("jdbc:mysql://localhost/mydatabase", "username", "password");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    // para obter a instância única do singleton
    public static ConnectionFactory getInstance() {
        if (instance == null) {
            instance = new ConnectionFactory();
        }
        return instance;
    }

    // para retornar a conexão com o banco de dados
    public Connection getConnection() {
        return connection;
    }


}
