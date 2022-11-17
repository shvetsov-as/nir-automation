package com.niimto.automation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class AutomationApplicationTests {

	@Test
	void contextLoads() {
		assertThat(new int[]{1, 2, 3, 4}).containsExactly(1, 2, 3, 4);
	}

}
