package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/11 9:09
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }


}
