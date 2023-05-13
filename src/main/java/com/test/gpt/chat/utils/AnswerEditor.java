package com.test.gpt.chat.utils;

import org.springframework.stereotype.Component;

@Component
public class AnswerEditor {

    public String editAnswer(String answer) {
        int startIndex = answer.lastIndexOf('\n') + 1;
        return answer.substring(startIndex);
    }
}
