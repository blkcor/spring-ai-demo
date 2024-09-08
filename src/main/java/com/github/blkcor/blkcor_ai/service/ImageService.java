//package com.github.blkcor.blkcor_ai.service;
//
//import jakarta.annotation.Resource;
//import org.springframework.ai.chat.prompt.Prompt;
//import org.springframework.ai.chat.prompt.PromptTemplate;
//import org.springframework.ai.image.ImagePrompt;
//import org.springframework.ai.image.ImageResponse;
//import org.springframework.ai.openai.OpenAiImageModel;
//import org.springframework.ai.openai.OpenAiImageOptions;
//import org.springframework.stereotype.Service;
//
//import java.util.Map;
//
//@Service
//public class ImageService {
//    @Resource
//    private OpenAiImageModel openaiImageModel;
//
//    public ImageResponse GenerateImage(String subject, String style, String dimensions,String quality) {
//        var template = """
//        Create an image of {subject}.
//        The style should be {style}.
//        The image quality should be {quality}.
//        """;
//        PromptTemplate promptTemplate = new PromptTemplate(template);
//        Map<String, Object> params = Map.of("subject", subject, "style", style, "quality", quality);
//        Prompt prompt = promptTemplate.create(params);
//        String[] wh = dimensions.split("x");
//
//        ImagePrompt imagePrompt = new ImagePrompt(prompt.getContents(), OpenAiImageOptions.builder().withQuality(quality).withN(1).withHeight(Integer.parseInt(wh[0])).withWidth(Integer.parseInt(wh[1])).build());
//        return openaiImageModel
//                .call(imagePrompt);
//    }
//}
