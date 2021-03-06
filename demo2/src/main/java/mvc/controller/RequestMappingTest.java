package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class RequestMappingTest {

    @RequestMapping(value={"/testRequestMapping","test","a?a"},
                    method={RequestMethod.GET,RequestMethod.POST},
                    params = {"username","password=12345"},
                    headers = {"Host=localhost:8080"})
    public String success(){
       return "success";
    }

    @GetMapping("/testGetMapping")
    public String testMapping(){
          return "success";
    }

    @RequestMapping("/testPath/{id}/{username}")
    public String testp(@PathVariable("id")Integer id,@PathVariable("username")String username){

        System.out.println("id="+id+"--username="+username);
        return "success";
    }
}
