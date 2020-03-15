package com.rokutesting.util;

import com.rokutesting.model.request.RokuPostLaunchRequestModel;
import org.apache.http.client.methods.CloseableHttpResponse;

import java.io.IOException;

public class ApplicationMain {
    public static void main(String[] args) throws IOException {
        HttpClientUtil httpClientUtil=new HttpClientUtil();

        //Get Sample Request
        CloseableHttpResponse response=httpClientUtil.getRokuRequest("http://dummy.restapiexample.com/api/v1/employees");
        System.out.println(response.getStatusLine());

        //Post Sample Request
        RokuPostLaunchRequestModel obj=new RokuPostLaunchRequestModel();
        obj.setChannelId("klnfkln");
        obj.setContentId("jkg");
        obj.setContentType("bfjbfk");
        CloseableHttpResponse response1=httpClientUtil.postRokuRequest("http://dummy.restapiexample.com/api/v1/create",obj);
        System.out.println(response1.getStatusLine());

        //Delete Sample Request
        CloseableHttpResponse response2=httpClientUtil.deleteRokuRequest("http://dummy.restapiexample.com/api/v1/delete/2");
        System.out.println(response2.getStatusLine());
    }
}
