package org.aop;

import org.aop.Objects.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration // данный класс - конфигурационный
@ComponentScan("org.aop") // поиск компонентов в директории
@EnableAspectJAutoProxy // подключение аспектов'
@PropertySource("classpath:myApp.properties") // использование свойств из данного файла
public class Config {

    @Value("${user.login}")
    private String name;
    @Value("${user.pass}")
    private String pass;

    @Bean
    @Scope("prototype")
    public User userBean(){
        return new User(name,pass);
    }
}
