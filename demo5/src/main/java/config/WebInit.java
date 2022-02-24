package config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author 温黎明
 * @version 1.0
 * @date 2021/9/10 13:26
 */

//web工程的初始化类,用来代替web.xml
public class WebInit  extends AbstractAnnotationConfigDispatcherServletInitializer {

    //指定Spring的配置类
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //指定SpringMVC的配置类
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    //指定DIspatcherServlet的映射规则,即url-pattern
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //用于注册过滤器
    protected Filter[] getServletFilters() {

        CharacterEncodingFilter characterEncodingFilter =new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceResponseEncoding(true);
        HiddenHttpMethodFilter hiddenHttpMethodFilter=new HiddenHttpMethodFilter();
        return new Filter[]{characterEncodingFilter,hiddenHttpMethodFilter};

    }
}
