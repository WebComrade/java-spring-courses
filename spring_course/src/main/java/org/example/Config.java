package org.example;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("org.example")
public class Config {

    @Bean
    @Scope("prototype")
    public Pet dogBean(){ // dogBean - id
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    public Person personBean(){
        return new Person(dogBean());
    }
}
