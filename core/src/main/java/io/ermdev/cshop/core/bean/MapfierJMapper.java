package io.ermdev.cshop.core.bean;

import io.ermdev.mapfierj.ModelMapper;
import io.ermdev.mapfierj.SimpleMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapfierJMapper {

    @Bean
    public SimpleMapper simpleMapper() {
        return new SimpleMapper();
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
