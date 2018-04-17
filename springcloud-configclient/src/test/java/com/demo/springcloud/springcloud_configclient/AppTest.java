package com.demo.springcloud.springcloud_configclient;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;




public class AppTest {
   @Test
   public void test() throws URISyntaxException{
	   RestTemplate rest= new RestTemplate();
	   URI uri=new URI("http://localhost:8888/bus/refresh");
	   ResponseEntity<String> response=rest.exchange(uri,HttpMethod.POST,null,String.class);
	   System.out.println(response.getStatusCodeValue()+"---"+response.getBody()+"--"+response.getHeaders().getOrigin());
   }
  
}
