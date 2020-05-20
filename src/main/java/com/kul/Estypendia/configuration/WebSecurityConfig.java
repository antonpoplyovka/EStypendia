package com.kul.Estypendia.configuration;

import com.kul.Estypendia.model.User;
import com.kul.Estypendia.repository.UserRepo;
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;

@Configuration
//@EnableWebSecurity
//@EnableOAuth2Sso
public class WebSecurityConfig{// extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .mvcMatchers("/").permitAll()
//                .anyRequest().authenticated();
////                .and()
////                .csrf().disable();
//    }



    @Bean
    public PrincipalExtractor principalExtractor(UserRepo userRepo) {
        return map -> {
            return new User();
        };
    }
//    @Bean
//    CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200","http://localhost:8081","https://accounts.google.com"));
//        configuration.setAllowedMethods(Arrays.asList("GET","POST","PUT"));
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }

    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
}
