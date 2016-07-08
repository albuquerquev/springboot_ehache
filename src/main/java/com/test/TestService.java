package com.test;

import org.springframework.cache.annotation.Cacheable;

public interface TestService {
	@Cacheable("testServiceStringCache")
	public String getString();
}
