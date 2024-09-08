package com.github.blkcor.blkcor_ai.service;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ChatService {
    @Resource
    private ChatClient chatClient;
    // This method is used to chat with the AI
    public String chatAI(String prompt){
        return chatClient
                .prompt()
                .user(prompt)
                .call()
                .content();
    }

    public String getCityGuide(String city,  String interest, String language){
        var template = """
            I am a tourist visiting the city of {city}.
            I am mostly interested in {interest}.
            Tell me tips on what to do there.
            Please provide the information in {language}.
            """;
        PromptTemplate promptTemplate = new PromptTemplate(template);
        Map<String, Object> params = Map.of("city", city, "interest", interest, "language", language);
        Prompt prompt = promptTemplate.create(params);
        return chatClient
                .prompt()
                .user(prompt.getContents())
                .call()
                .content();
    }
}
