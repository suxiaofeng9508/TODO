package com.loveqh.test;

import org.apache.log4j.Logger;

/**
 * Created by WL on 2017-04-25.
 */
public class LoggerTest {

    private static Logger LOG = Logger.getLogger(LoggerTest.class);

    public static void main(String[] args) {
        LOG.debug("debug");
        LOG.info("info");
        LOG.error("error");
    }
}
