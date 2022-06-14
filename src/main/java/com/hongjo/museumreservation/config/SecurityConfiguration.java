package com.hongjo.museumreservation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((auth) -> {
                            try {
                                auth
                                        .anyRequest().authenticated()
                                        .and().formLogin()
                                        .loginPage("/login")
                                        .usernameParameter("input-ID")
                                        .passwordParameter("input-password")
                                        .permitAll()
                                        .and()
                                        .logout()
                                        .logoutUrl("/logout")
                                        .logoutSuccessUrl("/")
                                        .permitAll();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                )
                .httpBasic(withDefaults());
        return http.build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().antMatchers("/**", "/css/**", "/js/**", "/img/**");
    }

    @Bean
    public BCryptPasswordEncoder encode() {
        return new BCryptPasswordEncoder();
    }
}