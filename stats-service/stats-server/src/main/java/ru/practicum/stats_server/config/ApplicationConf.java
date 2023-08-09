package ru.practicum.stats_server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConf {
    @Value("${driverClassName:org.postgresql.Driver}")
    private String driverClassName;
    @Value("${url:jdbc:postgresql://localhost:5432/ewm}")
    private String url;
    @Value("${username:root}")
    private String username;
    @Value("${password:root}")
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
