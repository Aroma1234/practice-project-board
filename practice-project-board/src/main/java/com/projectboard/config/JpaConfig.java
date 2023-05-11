package com.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorAware() {  // jpa auditing을 할 때 마다 사람 이름은 "jiwon"으로 넣게 됨
        return () -> Optional.of("jiwon"); // TODO: 스프링 시큐리티로 인증 기능을 붙이게 될 때, 수정하자
    }
}
