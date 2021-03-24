package com.spring.security.configuration;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@EnableWebSecurity
public class MySecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        UserBuilder userBuilder = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("ruslan").password("ruslan").roles("HR","MANAGER"))
                .withUser(userBuilder.username("sergey").password("sergei").roles("HR"))
                .withUser(userBuilder.username("alexey").password("alexei").roles("EMPLOYEE"));

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("HR","MANAGER","EMPLOYEE")
                .antMatchers("/hr-info").hasRole("HR")
                .antMatchers("/manager-info/**").hasRole("MANAGER")
                .and().formLogin().permitAll();

    }
}
