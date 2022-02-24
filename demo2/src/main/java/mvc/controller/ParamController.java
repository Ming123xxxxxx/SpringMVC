package mvc.controller;

import bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/8/26 8:46
 */
@Controller
public class ParamController {
    @RequestMapping("/testparam")
    public String testparam(HttpServletRequest request){
        final HttpSession session = request.getSession();
        String name=request.getParameter("username");
       int pwd=Integer.parseInt(request.getParameter("password"));
        System.out.println("username="+name+"--password="+pwd);
        return "success";
    }

    @RequestMapping("/testSpringMVC")
    public String testspringmvc(@RequestParam(value = "user_name",required = false,defaultValue = "pinnnk") String username,
                                String password,
                                String[] hobby,
                                @RequestHeader(value = "Host",required = true,defaultValue = "biubiu") String host,
                                @CookieValue("JSESSIONID") String jsession){
        //若请求参数中出现多个同名的请求参数，可以再控制器方法的形参位置设置字符串类型或字符串数组接受此请求参数
        //若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接的字符串
        System.out.println("user_name="+username+"--password="+password+"--hobby="+ Arrays.toString(hobby));
        System.out.println("Host="+host);
        System.out.println("JSESSIONID="+jsession);
        return "success";
    }

    @RequestMapping("/testBean")
    public String testBean(User user){

        System.out.println(user);
        return "success";
    }
}
