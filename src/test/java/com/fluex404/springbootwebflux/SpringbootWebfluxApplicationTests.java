package com.fluex404.springbootwebflux;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class SpringbootWebfluxApplicationTests {

	@Test
	void contextLoads() {
		Arrays.asList(1, 2, 3)
				.stream()
				.map(t -> (t+2))
		.forEach(System.out::println);
	}

}
