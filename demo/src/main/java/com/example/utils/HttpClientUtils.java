package com.example.utils;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * 　* @Description: TODO
 * 　* @param ${tags}
 * 　* @return ${return_type}
 * 　* @throws
 * 　* @author lwj
 * 　* @date $date$ $time$
 *
 */
public class HttpClientUtils {



    public  static <InDto> void postHasParams(InDto inDto,String url){


        // 1.获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        // 2.创建POST请求
        HttpPost httpPost = new HttpPost(url);

        httpPost.setHeader("Content-Type","application/json;charset=utf-8");

        // 4.JSON.toJSONString();
        String jsonString = JSON.toJSONString(inDto);
        StringEntity entity = new StringEntity(jsonString, "utf-8");

        // 5.讲实体放入httppost中
        httpPost.setEntity(entity);
        httpPost.setHeader("Content-Type","application/json;charset=utf-8");

        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpPost);
            HttpEntity responseEntity = response.getEntity();
            System.out.println("相应状态为：" + response.getStatusLine());
            if (responseEntity != null) {
                System.out.println("相应长度为：" + responseEntity.getContentLength());
                System.out.println("相应内容为：" + EntityUtils.toString(responseEntity));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





    }


}
