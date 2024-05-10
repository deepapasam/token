package com.sprig.jwt.token.security;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class JwtManager {
	@GetMapping("/ttt")
	public String method() {
		
		return"hello";
	}

}
