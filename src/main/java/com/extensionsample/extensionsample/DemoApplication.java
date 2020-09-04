package com.extensionsample.extensionsample;

import com.extensionsample.extensionsample.extensions.StringExtensions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.experimental.ExtensionMethod;

@SpringBootApplication
@ExtensionMethod({
    StringExtensions.class
})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
