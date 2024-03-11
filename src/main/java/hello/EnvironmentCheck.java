package hello;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;

@Slf4j
public class EnvironmentCheck {

    private final Environment env;

    public EnvironmentCheck(Environment env) {
        this.env = env;
    }

    @PostConstruct
    public void init() {
        final String url = env.getProperty("url");
        final String username = env.getProperty("username");
        final String password = env.getProperty("password");
        log.info("env url={}", url);
        log.info("username url={}", username);
        log.info("password url={}", password);
    }
}
