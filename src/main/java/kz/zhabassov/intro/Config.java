package kz.zhabassov.intro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Configuration
@ImportResource("classpath:intro.xml")
public class Config {
    @Bean
    public Logger fileLogger(){
        return  new FileLogger("C:\\Users\\tamerlan_zhabassov\\IdeaProjects\\intro_spring\\log\\log.txt");
    }

    @Bean
    @LoggerAnnotation
    public Logger consoleLogger(){
        return new ConsoleLogger();
    }

//    @Bean
//    @LoggerAnnotation
//    public List loggerList(){
//        List<Logger> loggers = new ArrayList<>();
//        loggers.add(new ConsoleLogger());
//        loggers.add(new FileLogger("C:/Users/Lenovo/Downloads/intro/log/log.txt"));
//        return loggers;
//    }


}
