package com.joyceworks.et.infra.db.mapper;

import com.joyceworks.et.infra.db.dataobject.WordDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordMapper extends JpaRepository<WordDO, Long> {
    WordDO findByWord(String word);
}
