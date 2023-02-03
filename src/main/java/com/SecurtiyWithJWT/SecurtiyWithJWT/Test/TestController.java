package com.SecurtiyWithJWT.SecurtiyWithJWT.Test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/Test")
@RequiredArgsConstructor
public class TestController {
    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("hiiii");
    }
}
