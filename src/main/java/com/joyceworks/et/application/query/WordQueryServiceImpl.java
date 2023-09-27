package com.joyceworks.et.application.query;

import com.joyceworks.et.application.query.dto.WordDTO;
import com.joyceworks.et.infra.db.mapper.WordMapper;
import org.springframework.stereotype.Service;

@Service
public class WordQueryServiceImpl implements WordQueryService {
    private final WordMapper mapper;

    public WordQueryServiceImpl(WordMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public WordDTO query(String word) {
        return WordDTO.of(mapper.findByWord(word));
    }
}
