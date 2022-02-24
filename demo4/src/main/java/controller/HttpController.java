package controller;

import bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/4 14:55
 */
@Controller
public class HttpController {

    @RequestMapping("testRequestBody")
    public String testrequestbody(@RequestBody String requestBody){
        System.out.println("requestBody="+requestBody);
        return "success";

    }

    @RequestMapping("/testRequestEntity")
    public String testrequestentity(RequestEntity<String> requestEntity) {
        //当前requestEntity表示整个请求报文的信息
        System.out.println("请求头:"+requestEntity.getHeaders());
        System.out.println("请求体:"+requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testrespnse(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello,response");
    }

    @RequestMapping("testResponseBody")
    @ResponseBody
    public String testresponsebody(){


        return "@Request,Suceess";
    }

    @RequestMapping("/testResponseUser")
    @ResponseBody
    public User testResponseUser(){

        return new User(1001,"lihua","12345",22,"男");
    }
}
