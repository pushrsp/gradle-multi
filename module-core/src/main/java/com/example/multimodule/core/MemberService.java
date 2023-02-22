package com.example.multimodule.core;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public void saveMember() {
        memberRepository.save(Member.builder().name("web").build());
    }

    @Transactional(readOnly = true)
    public Member findMember() {
        return memberRepository.findById(1L).get();
    }

}
