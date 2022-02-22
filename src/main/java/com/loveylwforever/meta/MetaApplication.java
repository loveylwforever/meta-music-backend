package com.loveylwforever.meta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MetaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetaApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome(@RequestParam(value = "name", defaultValue = "程序员高健") String name){
		return String.format("欢迎你,%s", name);
	}

}
