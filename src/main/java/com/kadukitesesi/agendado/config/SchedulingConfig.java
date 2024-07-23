package com.kadukitesesi.agendado.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulingConfig {

    private final Logger logger = LoggerFactory
            .getLogger(SchedulingConfig.class);

    @Scheduled(cron = "0 48 17 * * 1-5")
    protected void execucaoComDelay() {
        logger.info("Executando tarefa que me foi passada");
    }


}
