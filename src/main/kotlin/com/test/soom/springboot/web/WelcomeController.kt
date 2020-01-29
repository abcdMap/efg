package com.test.soom.springboot.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WelcomeController {
	@GetMapping("/welcome")
	fun welcome():String {
		return "welcome"
	}
}