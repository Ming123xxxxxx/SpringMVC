package controller;

import bean.Employee;
import dao.EmloyeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/3 1:46
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmloyeeDao emloyeeDao;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getEmployee(Model model){

        Collection<Employee> emploeeList=emloyeeDao.getAll();
        model.addAttribute("employeeList",emploeeList);
        return "elist";
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id){
        emloyeeDao.delete(id);
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
         emloyeeDao.save(employee);
         return "redirect:/employee";
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public String getEmoloyeeById(@PathVariable("id") Integer id,Model model){
        Employee employee = emloyeeDao.get(id);
        model.addAttribute("employee",employee);
        return "eupdate";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public  String updateEmployee(Employee employee){
        emloyeeDao.save(employee);
        return "redirect:/employee";
    }
}
