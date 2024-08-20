package com.example.insurance.client.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/insurnaceClient")
public class InsuranceClientApplication {


	@Autowired
	private RestTemplate template;

	@Value("${insurance.provider.url}")
	private String url;

	@GetMapping("/getPlan")
	public List<String> getPlan(){
		List<String> plans = template.getForObject(url, List.class);
		return plans;
	}

	public static void main(String[] args) {
		SpringApplication.run(InsuranceClientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}


}
