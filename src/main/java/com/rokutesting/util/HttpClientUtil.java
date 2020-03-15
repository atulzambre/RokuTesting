package com.rokutesting.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;


public class HttpClientUtil {
    ObjectMapper objectMapper=new ObjectMapper();
    CloseableHttpClient httpClient= HttpClients.createDefault();

    public CloseableHttpResponse getRokuRequest(String uri) throws IOException {
        HttpGet httpGet=new HttpGet(uri);
        CloseableHttpResponse response=httpClient.execute(httpGet);
        return response;
    }

    public CloseableHttpResponse postRokuRequest(String uri, Object obj) throws IOException {
        HttpPost httpPost=new HttpPost(uri);
        StringEntity stringEntity=new StringEntity(objectMapper.writeValueAsString(obj));
        httpPost.setEntity(stringEntity);
        CloseableHttpResponse response=httpClient.execute(httpPost);
        return response;
    }

    public CloseableHttpResponse deleteRokuRequest(String uri) throws IOException {
        HttpDelete  httpDelete=new HttpDelete(uri);
        CloseableHttpResponse response=httpClient.execute(httpDelete);
        return response;
    }



}
