package ra.edu.ss13homework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Tắt CSRF vì đây là REST API (stateless)
                .csrf(AbstractHttpConfigurer::disable)
                // Cấu hình phân quyền endpoint
                .authorizeHttpRequests(auth -> auth
                        // Cho phép tất cả mọi người truy cập /api/v1/auth/**
                        .requestMatchers("/api/v1/auth/**").permitAll()
                        // Các request còn lại bắt buộc phải xác thực
                        .anyRequest().authenticated()
                );

        return http.build();
    }
}
