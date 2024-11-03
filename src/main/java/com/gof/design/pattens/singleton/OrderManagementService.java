package com.gof.design.pattens.singleton;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OrderManagementService {

    private static OrderManagementService instance;
    private static final Logger logger = LogManager.getLogger(OrderManagementService.class);

    private OrderManagementService() {
    }

    public static synchronized OrderManagementService getInstance() {
        if(instance == null) {
            instance = new OrderManagementService();
        }
        return instance;
    }

    public void placeOrder() {
        logger.info("Place order");
    }

}
