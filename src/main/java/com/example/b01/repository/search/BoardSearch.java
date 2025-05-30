package com.example.b01.repository.search;

import com.example.b01.domain.Board;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

public interface BoardSearch {
    Page<Board> search1(Pageable pageable);

    Page<Board> searchAll(String[] types, String keyword, Pageable pageable);
}
