package ru.otus.example;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOGGER.info("Hello World");
    }

}