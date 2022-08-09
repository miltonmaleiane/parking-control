package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);




	}
	@GetMapping("/yoo")
	public String index(){
		int a;
		int b;
		int c;

		a=4;
		b = 12;
		c = a +b;
		return "Soma "+ a+"+"+b+"="+ c;


	}
	@GetMapping("/1")
	public String ex (){
		return "essa e a segunda pagina";
	}
}