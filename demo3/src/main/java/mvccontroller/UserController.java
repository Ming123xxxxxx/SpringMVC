package mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/2 10:56
 */
@Controller
public class UserController {
    /*
      使用RESTFul模拟用户资源的增删改擦
      /user    Get    查询所有用户信息
      /user/1  Get    根据用户id查询用户信息
      /user    Post   添加用户信息
      /user/1  Delete 删除用户信息
      /user    put    修改用户信息
     */

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public  String  getUserById(){
        System.out.println("根据id查询用户信息");
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public  String  insertUser(String username,String password){
        System.out.println("添加用户信息："+username+","+password);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public  String  updateUser(String username,String password){
        System.out.println("修改用户信息："+username+","+password);
        return "success";
    }


}
