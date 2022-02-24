package dao;

import bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/3 1:51
 */
@Repository
public class EmloyeeDao {

    private static Map<Integer,Employee> employees = null;

    static{
        employees =new HashMap<Integer,Employee>();

        employees.put(1001,new Employee(1001,"E-AA","1@qq.com","女"));
        employees.put(1002,new Employee(1002,"E-BB","2@qq.com","男"));
        employees.put(1003,new Employee(1003,"E-CC","3@qq.com","阴阳人"));
        employees.put(1004,new Employee(1004,"E-DD","4@qq.com","变性人"));
        employees.put(1005,new Employee(1005,"E-EE","5@qq.com","外星人"));
    }

    private static Integer initId=1006;

    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(initId++);
        }
        employees.put(employee.getId(),employee);
    }

    public Collection<Employee> getAll(){
        return employees.values();
    }

    public Employee get(Integer id){
        return employees.get(id);
    }

    public void delete(Integer id){
        employees.remove(id);
    }
}
