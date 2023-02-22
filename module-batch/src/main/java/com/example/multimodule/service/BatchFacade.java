package com.example.multimodule.service;

import com.example.multimodule.core.Member;
import com.example.multimodule.core.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BatchFacade {

    private final MemberService memberService;

    public void saveMember() {
        memberService.saveMember();
    }

    public Member findMember() {
        return memberService.findMember();
    }

}
