package vn.edu.iuh.fit.backend.dtos;

import lombok.*;

import java.util.Collection;

/**
 * DTO for pagination
 * @param <T> type of values
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class PageDto <T>{
    private int page;
    private int size;
    private Collection<T> values;
    private int total;
    private int totalPages;
    private String sortBy;
    private String sortType = "ASC";
}
