package com.xplmc.learning.whitelist.common.configuration;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * system level configuration
 * 1/Enable Jap Auditing
 * 2/Enable Thymeleaf Layout Dialect
 *
 * @author luke
 */
@Configuration
@EnableJpaAuditing
public class SystemLevelConfiguration {

    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }

}
