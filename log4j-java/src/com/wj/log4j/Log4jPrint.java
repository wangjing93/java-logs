package com.wj.log4j;

import org.apache.log4j.Logger;

/**
 * Created by WangJing on 2017/1/4.
 */
public class Log4jPrint {

    private static Logger logger = Logger.getLogger(Log4jPrint.class);

    public static void main(String[] args) {
        System.out.println("打印system out");

        logger.debug("debug msg");
        logger.info("info msg");
        logger.error("error msg");
    }
}
