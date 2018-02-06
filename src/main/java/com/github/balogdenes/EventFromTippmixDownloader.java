package com.github.balogdenes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventFromTippmixDownloader {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private CloseableHttpClient client;

    @Autowired
    private HttpPost httpPost;

    public List<Event> getEventData() throws IOException {
        List<Event> eventList = null;

        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");

        HttpResponse response = client.execute(httpPost);
        String jsonString = IOUtils.toString(response.getEntity().getContent(), "UTF-8");

        TypeReference<HashMap<String, Object>> typeRef
                = new TypeReference<HashMap<String, Object>>() {};

        Map<String, Object> responseMap = objectMapper.readValue(jsonString, typeRef);

        Map<String, Object> dataMap = (Map<String, Object>)responseMap.get("data");
        if(dataMap != null) {
            List<Object> events = (List<Object>)dataMap.get("events");
            TypeReference<List<Event>> listTypeRef
                    = new TypeReference<List<Event>>() {};
            eventList = objectMapper.convertValue(events,listTypeRef);

        }
        return eventList;
    }
}
