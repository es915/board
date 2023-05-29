package com.adventurer.board.repository;

import com.adventurer.board.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<Board, Long> {
    // update board set view=view+1 where id=?
    @Modifying
    @Query(value = "update Board b set b.view=b.view+1 where b.id=:id")
    void updateview(@Param("id")Long id);
}
