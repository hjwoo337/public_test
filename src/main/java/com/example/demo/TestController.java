package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // ✅ Rest API 응답을 위한 컨트롤러
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "20250228 0947 test";  // "test"라는 문자열이 그대로 응답됨
    }
}
