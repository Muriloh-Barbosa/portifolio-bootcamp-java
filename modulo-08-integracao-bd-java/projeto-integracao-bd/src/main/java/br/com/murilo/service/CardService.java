package br.com.murilo.service;

import br.com.murilo.dto.BoardColumnInfoDTO;
import br.com.murilo.exception.CardBlockedException;
import br.com.murilo.exception.CardFinishedException;
import br.com.murilo.exception.EntityNotFoundException;
import br.com.murilo.persistence.dao.BlockDAO;
import br.com.murilo.persistence.dao.CardDAO;
import br.com.murilo.persistence.entity.CardEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static br.com.murilo.persistence.entity.BoardColumnKindEnum.CANCEL;
import static br.com.murilo.persistence.entity.BoardColumnKindEnum.FINAL;

@AllArgsConstructor
public class CardService {

    private final Connection connection;

    public CardEntity create(final CardEntity entity) throws SQLException {
        try {
            var cardDAO = new CardDAO(connection);
            cardDAO.insert(entity);
            connection.commit();
            return entity;
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        }
    }

    public void moveToNextColumn(final Long cardId, final List<BoardColumnInfoDTO> boardColumnsInfo) throws SQLException {
        try {
            var cardDAO = new CardDAO(connection);
            var optional = cardDAO.findById(cardId);

            var dto = optional.orElseThrow(() ->
                    new EntityNotFoundException("O card de id %s não foi encontrado".formatted(cardId))
            );

            if (dto.blocked()) {
                throw new CardBlockedException(
                        "O card %s está bloqueado, é necessário desbloqueá-lo para mover".formatted(cardId)
                );
            }

            var currentColumn = boardColumnsInfo.stream()
                    .filter(bc -> bc.id().equals(dto.columnId()))
                    .findFirst()
                    .orElseThrow(() -> new IllegalStateException("O card informado pertence a outro board"));

            if (currentColumn.kind().equals(FINAL)) {
                throw new CardFinishedException("O card já foi finalizado");
            }

            var nextColumn = boardColumnsInfo.stream()
                    .filter(bc -> bc.order() == currentColumn.order() + 1)
                    .findFirst()
                    .orElseThrow(() -> new IllegalStateException("Não foi possível localizar a próxima coluna"));

            cardDAO.moveToColumn(nextColumn.id(), cardId);
            connection.commit();
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        }
    }

    public void cancel(final Long cardId, final Long cancelColumnId, final List<BoardColumnInfoDTO> boardColumnsInfo) throws SQLException {
        try {
            var cardDAO = new CardDAO(connection);
            var optional = cardDAO.findById(cardId);

            var dto = optional.orElseThrow(() ->
                    new EntityNotFoundException("O card de id %s não foi encontrado".formatted(cardId))
            );

            if (dto.blocked()) {
                throw new CardBlockedException(
                        "O card %s está bloqueado, é necessário desbloqueá-lo para mover".formatted(cardId)
                );
            }

            var currentColumn = boardColumnsInfo.stream()
                    .filter(bc -> bc.id().equals(dto.columnId()))
                    .findFirst()
                    .orElseThrow(() -> new IllegalStateException("O card informado pertence a outro board"));

            if (currentColumn.kind().equals(FINAL)) {
                throw new CardFinishedException("O card já foi finalizado");
            }

            boardColumnsInfo.stream()
                    .filter(bc -> bc.order() == currentColumn.order() + 1)
                    .findFirst()
                    .orElseThrow(() -> new IllegalStateException("Não foi possível localizar a próxima coluna"));

            cardDAO.moveToColumn(cancelColumnId, cardId);
            connection.commit();
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        }
    }

    public void block(final Long id, final String reason, final List<BoardColumnInfoDTO> boardColumnsInfo) throws SQLException {
        try {
            var cardDAO = new CardDAO(connection);
            var optional = cardDAO.findById(id);

            var dto = optional.orElseThrow(() ->
                    new EntityNotFoundException("O card de id %s não foi encontrado".formatted(id))
            );

            if (dto.blocked()) {
                throw new CardBlockedException("O card %s já está bloqueado".formatted(id));
            }

            var currentColumn = boardColumnsInfo.stream()
                    .filter(bc -> bc.id().equals(dto.columnId()))
                    .findFirst()
                    .orElseThrow();

            if (currentColumn.kind().equals(FINAL) || currentColumn.kind().equals(CANCEL)) {
                throw new IllegalStateException(
                        "O card está em uma coluna do tipo %s e não pode ser bloqueado".formatted(currentColumn.kind())
                );
            }

            var blockDAO = new BlockDAO(connection);
            blockDAO.block(reason, id);
            connection.commit();
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        }
    }

    public void unblock(final Long id, final String reason) throws SQLException {
        try {
            var cardDAO = new CardDAO(connection);
            var optional = cardDAO.findById(id);

            var dto = optional.orElseThrow(() ->
                    new EntityNotFoundException("O card de id %s não foi encontrado".formatted(id))
            );

            if (!dto.blocked()) {
                throw new CardBlockedException("O card %s não está bloqueado".formatted(id));
            }

            var blockDAO = new BlockDAO(connection);
            blockDAO.unblock(reason, id);
            connection.commit();
        } catch (SQLException ex) {
            connection.rollback();
            throw ex;
        }
    }

}
