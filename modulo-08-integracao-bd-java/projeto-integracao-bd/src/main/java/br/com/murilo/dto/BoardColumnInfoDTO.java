package br.com.murilo.dto;

import br.com.murilo.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(
        Long id,
        int order,
        BoardColumnKindEnum kind
) {
}
