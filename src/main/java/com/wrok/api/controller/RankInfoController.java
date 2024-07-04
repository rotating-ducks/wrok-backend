package com.wrok.api.controller;

import com.wrok.api.request.RankInfoRequest;
import com.wrok.api.response.RankInfoResponse;
import com.wrok.api.service.RankInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RankInfoController {

    private final RankInfoService rankInfoService;

    @GetMapping("/")
    public String tempPage() {
        return "try: /login, /logout, /rankinfo";
    }

    @GetMapping("/rankinfo")
    public List<RankInfoResponse> getAll() {
        return rankInfoService.getAll();
    }

    @GetMapping("/rankinfo/{id}")
    public RankInfoResponse getOne(@PathVariable Long id) {
        return rankInfoService.getOne(id);
    }

    @PostMapping("/rankinfo")
    public RankInfoResponse create(@RequestBody RankInfoRequest request) {
        return rankInfoService.create(request);
    }

}