package com.test.gpt.chat.utils;

import org.springframework.stereotype.Component;

@Component
public class PromptGenerator {
    private static final String POSTFIX = "\n위 글은 일기인데 이 일기에서 우울증이 의심되는 단어의 개수를 알려줘 대답은 숫자로만 부탁해";

    public String generate(String prompt) {
        return prompt + POSTFIX;
    }
}
