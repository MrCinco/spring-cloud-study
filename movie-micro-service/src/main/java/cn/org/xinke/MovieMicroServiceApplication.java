package cn.org.xinke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description 电影微服务主程入口
 * @author cinco
 * @date 2019/2/15
 */
@SpringBootApplication
public class MovieMicroServiceApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MovieMicroServiceApplication.class, args);
    }

}

