package com.example.fix.initiator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import quickfix.DefaultMessageFactory;
import quickfix.MessageFactory;

@Configuration
public class InitiatorConfiguration {
    @Bean
    public MessageFactory messageFactory() {
        // create messages in FIX protocol
        return new DefaultMessageFactory();
    }
}
