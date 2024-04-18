package com.cysiv.caching;

import com.cysiv.secrets.EnableSecrets;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableCaching
@EnableSecrets
@PropertySource("classpath:application-cache.yml")
public class CachingConfiguration {
}
