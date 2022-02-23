package com.simobkr.graphqldgs.datafetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.simobkr.graphqldgs.dto.Show;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class ShowDataFetcher {

    private final List<Show> shows = List.of
            (
            new Show("Stranger Things", 2016),
            new Show("Ozark", 2017),
            new Show("The Crown", 2016),
            new Show("Dead to Me", 2019),
            new Show("Orange is the New Black", 2013)
            );

    @DgsQuery
    public List<Show> shows(String titleFilter) {
        return shows.stream()
                    .filter(show -> show.getTitle().equals(titleFilter))
                    .collect(Collectors.toList());
    }
}
