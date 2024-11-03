package com.gof.design.pattens.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Order;

public class Demo {

    private static final Logger logger = LogManager.getLogger(Demo.class);

    public static void main(String[] args) {

        var instance1 = OrderManagementService.getInstance();
        var instance2 = OrderManagementService.getInstance();

        logger.info(instance1 == instance2);
        instance1.placeOrder();

    }

}
