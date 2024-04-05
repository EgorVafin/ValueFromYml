package ru.pet.valuetest;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Component
//@ConfigurationProperties(prefix = "word")
public class Config {

    @Value("${word.max}")
    private Integer max;
}
