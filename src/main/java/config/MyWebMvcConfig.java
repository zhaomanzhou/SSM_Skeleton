package config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class MyWebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/student/index").setViewName("/student/index.jsp");
        registry.addViewController("/student/teacher").setViewName("/student/teacher.jsp");
        registry.addViewController("/student/mark").setViewName("/student/mark.jsp");
    }
}
