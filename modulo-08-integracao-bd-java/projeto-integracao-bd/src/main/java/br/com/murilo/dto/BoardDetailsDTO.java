package br.com.murilo.dto;

import java.util.List;

import br.com.murilo.dto.BoardColumnDTO;

public record BoardDetailsDTO(
        Long id,
        String name,
        List<BoardColumnDTO> columns
) {
}
