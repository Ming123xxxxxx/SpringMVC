package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/8 1:08
 */
@Controller
public class TestController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor(){

        return "success";
    }

    @RequestMapping("/testExceptionHandler")
    public String textexceptionhandler(){
        System.out.println(1 / 0);
        return "success";
    }
}
