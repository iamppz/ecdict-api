package com.joyceworks.et.application.query;

import com.joyceworks.et.application.query.dto.WordDTO;

public interface WordQueryService {
    WordDTO query(String word);
}
