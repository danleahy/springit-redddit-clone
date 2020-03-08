package com.example.springit;

import com.example.springit.config.SpringITProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(SpringITProperties.class)
public class SpringitApplication {


//    @Autowired
//    private SpringITProperties springITProperties;
//
//    @Autowired
//    private ApplicationContext applicationContext;
    private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);


    public static void main(String[] args) {

        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Hello SpringIt");
    }

    @Bean
    CommandLineRunner runner() {
      return arts -> {
          log.error("CommandLineRunner.run();");
          log.warn("CommandLineRunner.run();");
          log.info("CommandLineRunner.run();");
          log.debug("CommandLineRunner.run();");
          log.trace("CommandLineRunner.run();");
      };
    };

//    @Bean
//    @Profile("dev")
//    CommandLineRunner runner() {
//        return args -> {
//            System.out.println("Welcome message is: " + springITProperties.getWelcomeMsg());
//            String [] beans = applicationContext.getBeanDefinitionNames();
//        };
//    }
}
