package com.hybrid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class MosaicWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MosaicWebApplication.class, args);
	}
}
