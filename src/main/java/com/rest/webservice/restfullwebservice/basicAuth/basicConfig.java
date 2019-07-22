package com.rest.webservice.restfullwebservice.basicAuth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebSecurity
public class basicConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http
               .csrf().disable()
               .authorizeRequests()
               .antMatchers(HttpMethod.GET, "/**").permitAll()
               .antMatchers(HttpMethod.PUT, "/**").permitAll()
               .antMatchers(HttpMethod.DELETE, "/**").permitAll()
               .antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
               .antMatchers("/console/**").permitAll()
               //Allow every request to accses the method
                            .anyRequest().authenticated()
                            .and()
                            .httpBasic();



    }


}
