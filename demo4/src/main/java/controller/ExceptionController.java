package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/9 10:57
 */

//@ControllerAdvice将当前类标识为异常处理的组件
@ControllerAdvice
public class ExceptionController {

    //@ExceptionHandler用于设置所标识方法处理的异常
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public String testException(Exception e, Model model){
    //此处的e表示当前请求处理中出现的异常对象
        model.addAttribute("ex",e);
        return "error";
    }
}
