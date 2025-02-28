package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // ✅ Rest API 응답을 위한 컨트롤러
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "작업을 완료했습니다!";  // "test"라는 문자열이 그대로 응답됨
    }
}
