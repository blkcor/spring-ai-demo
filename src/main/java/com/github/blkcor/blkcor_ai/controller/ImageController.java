package com.github.blkcor.blkcor_ai.controller;

import com.github.blkcor.blkcor_ai.service.ImageService;
import jakarta.annotation.Resource;
import org.springframework.ai.image.ImageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
    @Resource
    private ImageService imageService;

    @GetMapping("/ai/image")
    public ImageResponse getImage(
            @RequestParam(value = "subject", defaultValue = "a cat") String subject,
            @RequestParam(value = "style", defaultValue = "abstract") String style,
            @RequestParam(value = "dimensions", defaultValue = "1024x1024") String dimensions,
            @RequestParam(value = "quality", defaultValue = "hd") String quality
    ) {
        return imageService.GenerateImage(subject, style, dimensions, quality);
    }
}
