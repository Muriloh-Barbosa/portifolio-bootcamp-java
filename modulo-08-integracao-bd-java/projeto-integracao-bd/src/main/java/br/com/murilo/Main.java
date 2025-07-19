package br.com.murilo;

import br.com.murilo.persistence.migration.MigrationStrategy;
import br.com.murilo.ui.MainMenu;

import java.sql.SQLException;

import static br.com.murilo.persistence.config.ConnectionConfig.getConnection;

public class Main {

    public static void main(String[] args) throws SQLException {
        // Executa a migração do banco de dados antes de iniciar o sistema
        try (var connection = getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        }

        // Inicia o menu principal do sistema
        new MainMenu().execute();
    }

}
