package br.com.murilo.service;

import br.com.murilo.dto.CardDetailsDTO;
import br.com.murilo.persistence.dao.CardDAO;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class CardQueryService {

    private final Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var cardDAO = new CardDAO(connection);
        return cardDAO.findById(id);
    }

}
