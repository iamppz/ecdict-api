package com.joyceworks.et.web;

import com.joyceworks.et.application.query.dto.WordDTO;
import com.joyceworks.et.application.query.WordQueryService;
import com.joyceworks.et.infra.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/words")
@RestController
public class WordController {

  private final WordQueryService queryService;

  public WordController(WordQueryService queryService) {
    this.queryService = queryService;
  }

  @GetMapping("/{word}")
  public ResponseEntity<Result<WordDTO>> query(@PathVariable("word") String word) {
    final WordDTO dto = queryService.query(word);
    return ResponseEntity.ok(Result.of(true, "Ok", dto, "success"));
  }
}
