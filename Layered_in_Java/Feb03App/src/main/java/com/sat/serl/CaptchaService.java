package com.sat.serl;

import org.springframework.stereotype.Service;

@Service
public class CaptchaService {
	public String generateCaptcha() {
		return "some captcha word";
	}
	public String generateMathCaptcha() {
		return "2 + - = 5";
	}
}
