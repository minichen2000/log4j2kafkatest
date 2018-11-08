package com.log4j2_kafka_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

public class Main {

    private static Logger log = null;

    public static void main(String[] args) {

        String confPath = "D:\\gitrepo\\private\\github\\log4j2kafkatest";

        System.setProperty("log4j.configurationFile", confPath + "\\log4j2.xml");
        LoggerContext loggerContext = (LoggerContext) LogManager.getContext(false);
        loggerContext.reconfigure();

        log = LogManager.getLogger("kafkaLog");
        for (int i = 0; i < 2000; i++) {
            log.info("Hello---" + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}