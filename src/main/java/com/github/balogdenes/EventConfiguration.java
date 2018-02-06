package com.github.balogdenes;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfiguration {
    @Bean
    public EventFromTippmixDownloader eventFromTippmixDownloader(){
        return new EventFromTippmixDownloader();
    }

    @Bean
    public HttpPost httpPost(){
        return new HttpPost("http://api.tippmix.hu/tippmix/search");
    }

    @Bean
    public CloseableHttpClient httpClient(){
        CloseableHttpClient client = HttpClients.createDefault();
        return client;
    }
}
