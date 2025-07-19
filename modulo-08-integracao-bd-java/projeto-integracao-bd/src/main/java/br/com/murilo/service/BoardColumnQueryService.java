package br.com.murilo.service;

import br.com.murilo.persistence.dao.BoardColumnDAO;
import br.com.murilo.persistence.entity.BoardColumnEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class BoardColumnQueryService {

    private final Connection connection;

    public Optional<BoardColumnEntity> findById(final Long id) throws SQLException {
        var boardColumnDAO = new BoardColumnDAO(connection);
        return boardColumnDAO.findById(id);
    }

}
