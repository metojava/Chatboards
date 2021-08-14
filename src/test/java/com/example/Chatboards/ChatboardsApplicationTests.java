package com.example.Chatboards;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.dating.ChatboardsApplication;
import com.dating.controller.DaterConroller;
import com.dating.model.Daters;

@SpringBootTest(classes = ChatboardsApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class ChatboardsApplicationTests {

	@Autowired
	DaterConroller daterConroller;

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() throws Exception {
		assertThat(daterConroller).isNotNull();
	}

	@Test
	public void blockingUserisSuccessful() throws Exception {
		String testUrl = "http://localhost:" + port + "/daters/api/datersBlockOrUnblock";
		String request = "{\n" + "  \"dateId\": 2,\n" + "  \"isBlockedBy\": 2,\n" + "  \"userId\": 1\n" + "}";

		Daters ds = new Daters(2, 0, 1);

		ResponseEntity<String> response = this.restTemplate.postForEntity(testUrl, ds, String.class);

		assertThat(response.getBody()).contains("you have successfully");
	}

}
