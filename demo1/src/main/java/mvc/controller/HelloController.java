package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    //访问路径为:”/" -->/WEB-INF/templates/index.html
    @RequestMapping(value="/")
    public String index(){
        //返回视图名称
        return "index";
    }

    @RequestMapping(value="target")
    public String toTarget(){
        return "target";
    }
}
