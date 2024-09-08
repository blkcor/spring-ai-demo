package com.github.blkcor.blkcor_ai.service;

import jakarta.annotation.Resource;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;


@Service
public class LlamaService {
    @Resource
    private OllamaChatModel ollamaChatModel;

    public String chatAI(String prompt) {
         return ollamaChatModel.call(prompt);
    }
}
