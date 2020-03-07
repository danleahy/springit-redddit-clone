package com.example.springit.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "springit")
public class SpringITProperties {
    /**
     * This is our welcome message.
     * @return
     */

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    private String welcomeMsg = "Hello World";
}
