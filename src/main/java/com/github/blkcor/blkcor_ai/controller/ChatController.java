//package com.github.blkcor.blkcor_ai.controller;
//
//import com.github.blkcor.blkcor_ai.service.ChatService;
//import jakarta.annotation.Resource;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Map;
//
//@RestController
//public class ChatController {
//
//    @Resource
//    private ChatService chatService;
//
//    @GetMapping("/ai/chat")
//    Map<String, String> Chat(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
//        return Map.of(
//                "completion",
//                chatService.chatAI(message));
//    }
//
//    @GetMapping("/ai/chat/cityGuide")
//    Map<String, String> CityGuide(
//            @RequestParam(value = "city", defaultValue = "海南") String city,
//            @RequestParam(value = "interest", defaultValue = "三天旅游计划") String interest,
//            @RequestParam(value = "language", defaultValue = "中文") String language
//    ) {
//        return Map.of(
//                "completion",
//                chatService.getCityGuide(city,interest,language));
//    }
//
//}
