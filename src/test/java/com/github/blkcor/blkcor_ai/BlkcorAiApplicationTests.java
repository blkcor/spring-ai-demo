package com.github.blkcor.blkcor_ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class BlkcorAiApplicationTests {

	@Resource
	private RestTemplate restTemplate;
	@Test
	void restTemplateTest() {
		try{
			ResponseEntity<byte[]> forEntity = restTemplate.getForEntity("https://oaidalleapiprodscus.blob.core.windows.net/private/org-uxRkZXOVzhWckSYQkUN8rI0f/user-o8EOzm2Mu15guNrr4r7An0Jl/img-hCiEfLzHQ3kJyEHeX75GxAIz.png?st=2024-09-08T01%3A29%3A11Z&se=2024-09-08T03%3A29%3A11Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-09-07T22%3A29%3A12Z&ske=2024-09-08T22%3A29%3A12Z&sks=b&skv=2024-08-04&sig=uppdUccVQi3e0Pz/w04LncAwkiWBYzlpD6L9lXKP%2B84%3D", byte[].class);
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
