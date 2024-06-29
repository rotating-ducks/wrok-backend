package com.wrok.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RankInfoController {

    @GetMapping("/")
    public String tempPage() {
        return "try: /login, /logout, /ping";
    }

    @GetMapping("/ping")
    public String pingpong() {
        return "pong";
    }
    
}