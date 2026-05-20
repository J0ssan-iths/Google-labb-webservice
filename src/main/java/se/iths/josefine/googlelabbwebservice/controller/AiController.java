package se.iths.josefine.googlelabbwebservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se.iths.josefine.googlelabbwebservice.service.GeminiService;

@RestController
@RequestMapping("/api/gemini")
@RequiredArgsConstructor
public class AiController {

    private final GeminiService geminiService;

    @GetMapping("/ask")
    public String askGemini(@RequestParam String prompt) {
        return geminiService.askGemini(prompt);
    }
}
