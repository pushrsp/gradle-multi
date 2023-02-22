package com.example.multimodule.controller;

import com.example.multimodule.core.Member;
import com.example.multimodule.service.BatchFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BatchController {

    private final BatchFacade batchFacade;

    @PostMapping("/")
    public void saveMember() {
        batchFacade.saveMember();
    }

    @GetMapping("/")
    public Member getNewMember() {
        return batchFacade.findMember();
    }

}
