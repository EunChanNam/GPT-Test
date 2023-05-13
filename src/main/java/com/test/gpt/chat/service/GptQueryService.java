package com.test.gpt.chat.service;

import com.test.gpt.chat.controller.dto.request.ChatGptRequest;
import com.test.gpt.chat.utils.AnswerEditor;
import com.test.gpt.chat.utils.GptRequestGenerator;
import io.github.flashvayne.chatgpt.dto.ChatResponse;
import io.github.flashvayne.chatgpt.service.ChatgptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GptQueryService {

    private final ChatgptService chatgptService;
    private final GptRequestGenerator requestGenerator;
    private final AnswerEditor answerEditor;

    public String query(ChatGptRequest request) {

        ChatResponse response = chatgptService.sendChatRequest(requestGenerator.generate(request.getPrompt()));
        return answerEditor.editAnswer(response.getChoices().get(0).getText());
    }
}
