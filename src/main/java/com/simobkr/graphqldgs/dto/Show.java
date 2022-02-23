package com.simobkr.graphqldgs.dto;

import lombok.*;

@Data
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Show {
    private final String title;
    private final Integer releaseYear;
}
