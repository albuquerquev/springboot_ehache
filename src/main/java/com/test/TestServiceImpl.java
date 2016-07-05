package com.test;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
	@Override
	public String getString() {
		return "Hello World!";
	}
}
