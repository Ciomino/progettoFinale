package com.example.provaProgettoFinale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((authorizeRequests) ->
                authorizeRequests
                    .requestMatchers("/register", "/login").permitAll()
                    .requestMatchers("/events/add", "/events/edit/**", "/events/delete/**").hasRole("ADMIN")
                    .anyRequest().authenticated()
            )
            .formLogin((formLogin) ->
                formLogin
                    .loginPage("/login")
                    .defaultSuccessUrl("/events", true)
            )
            .logout((logout) ->
                logout
                    .permitAll()
            );

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {

        var admin = User.withDefaultPasswordEncoder()
            .username("admin")
            .password("admin")
            .roles("ADMIN")
            .build();

        return new InMemoryUserDetailsManager(admin);
    }
}
