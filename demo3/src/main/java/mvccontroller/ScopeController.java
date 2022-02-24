package mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/8/31 12:44
 */
@Controller
public class ScopeController {

    //使用ServletAPI向request域对象共享数据
    @RequestMapping("/testRequestByServletAPI")
    public String RequestServletAPI(HttpServletRequest request){

        request.setAttribute("testrequestScope","Hello,ServletAPI");
          return "success";
    }

    //使用ModelAndView向request域对象共享数据
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(){

        //ModelAndView有Model和View的功能
        //Moderl主要用于向请求域共享数据
        //View主要用于设置视图,实现页面跳转
        ModelAndView mav=new ModelAndView();
        //处理模型数据.即向请求域request共享数据
        mav.addObject("testrequestScope","Hello,ModelAndView");
        //设置视图名称,实现页面跳转
        mav.setViewName("success");
        return mav;
    }

    //使用Model向request域对象共享数据
    @RequestMapping("/testModel")
    public String testmodel(Model model){

        model.addAttribute("testrequestScope","hello,Model");
         return "success";
    }

    //使用map向request域对象共享数据
    @RequestMapping("/testMap")
    public String testmap(Map<String,Object> map){

        map.put("testrequestScope","hello,map");
        return "success";
    }

    //使用ModelMap向域对象共享数据
    @RequestMapping("/testModelMap")
    public String testmodelmap(ModelMap modelmap){

        modelmap.addAttribute("testrequestScope","hello,MOdelMap");
        return "success";
    }

    //通过ServletAPI向Session域共享数据
    @RequestMapping("/testSession")
    public String testsession(HttpSession session){

        session.setAttribute("testSessionScope","hello,Session");
        return "success";
    }

    //通过ServletAPI向Application域共享数据
    @RequestMapping("/testApplication")
    public  String  testapplication(HttpSession session){

        ServletContext application=session.getServletContext();
        application.setAttribute("testApplicationScope","hello,Application");
        return "success";
    }
}
