package com.pillar.civicsquiz.integration_test;

import com.pillar.civicsquiz.Inquiry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class RestTemplateTest {

    private static final String ROOT_URL = "http://localhost:8080";
    RestTemplate restTemplate = new RestTemplate();

    @Test
    public void testGetAllInquiries(){
        ResponseEntity<Inquiry[]> responseEntity =
                restTemplate.getForEntity(ROOT_URL+"/api/inquiries", Inquiry[].class);
        List<Inquiry> inquiries = Arrays.asList(responseEntity.getBody());
        for (Inquiry i : inquiries) {
            System.out.println(i.toString());
        }
        assertEquals(5, inquiries.size());
    }
}