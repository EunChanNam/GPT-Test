package com.test.gpt.chat.controller;

import com.test.gpt.chat.controller.dto.request.ChatGptRequest;
import com.test.gpt.chat.service.GptQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/gpt")
public class GptController {

    private final GptQueryService gptQueryService;

    @PostMapping
    public ResponseEntity<String> query(@RequestBody ChatGptRequest request) {

        return ResponseEntity.ok(gptQueryService.query(request));
    }
}
