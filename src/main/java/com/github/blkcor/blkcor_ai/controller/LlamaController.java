package com.github.blkcor.blkcor_ai.controller;

import com.github.blkcor.blkcor_ai.service.LlamaService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LlamaController {
    @Resource
    private LlamaService llamaService;

    @GetMapping("/ai/llama/chat")
    public String ChatToLlama(@RequestParam(value = "prompt", defaultValue = "why the sky is blue?") String prompt) {
        return llamaService.chatAI(prompt);
    }
}
