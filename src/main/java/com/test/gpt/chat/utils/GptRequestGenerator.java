package com.test.gpt.chat.utils;

import io.github.flashvayne.chatgpt.dto.ChatRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class GptRequestGenerator {
    private static final String MODEL = "text-davinci-003";
    private static final int MAX_TOKEN = 50;
    private static final double TEMPERATURE = 0.5;
    private static final double TOP_P = 0.9;

    private final PromptGenerator promptGenerator;

    public ChatRequest generate(String prompt) {
        return new ChatRequest(
                MODEL,
                promptGenerator.generate(prompt),
                MAX_TOKEN,
                TEMPERATURE,
                TOP_P
        );
    }

}
