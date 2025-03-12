package org.hyeong.gooinprochatapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 엔드포인트 허용
                .allowedOriginPatterns("*") // 모든 출처 허용
                .allowedMethods("GET", "POST", "PUT", "DELETE", "FETCH", "HEAD", "OPTIONS") // 허용할 HTTP 메서드
                .allowedHeaders("*") // 모든 헤더 허용
                .allowCredentials(true); // 인증 정보 포함 (쿠키, Authorization 헤더 등)
    }
}

