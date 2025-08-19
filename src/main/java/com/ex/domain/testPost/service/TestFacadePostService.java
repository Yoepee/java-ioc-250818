package com.ex.domain.testPost.service;

import com.ex.domain.testPost.repository.TestPostRepository;
import com.ex.framework.annotations.Service;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TestFacadePostService {
    private final TestPostService testPostService;
    private final TestPostRepository testPostRepository;
}
