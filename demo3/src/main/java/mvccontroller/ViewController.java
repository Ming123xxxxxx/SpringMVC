package mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/1 9:28
 */
@Controller
public class ViewController {

    @RequestMapping("/testThymeleafView")
    public String testthymeldeaf(){


        return "success";
    }

    @RequestMapping("/testForward")
    public String testforward(){

        return "forward:/testThymeleafView";
    }

    @RequestMapping("/testRedirect")
    public String testredirect(){

        return "redirect:/testThymeleafView";
    }
}
