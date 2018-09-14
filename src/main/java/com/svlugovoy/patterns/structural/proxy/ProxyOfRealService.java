package com.svlugovoy.patterns.structural.proxy;

import java.time.LocalDateTime;

public class ProxyOfRealService implements ServiceInterface{

    RealService realService;
    boolean isAdmin = true;
    String cache;

    public ProxyOfRealService(RealService realService) {
        this.realService = realService;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String doOperation() {
        System.out.println("\nStart executing doOperation(), " + LocalDateTime.now());
        if (isAdmin) {
            if (cache != null){
                cache = "cached " + realService.doOperation();
            } else {
                cache = realService.doOperation();
            }
            System.out.println("doOperation() executed successfully, " + LocalDateTime.now());
        } else {
            System.out.println("You cannot use this service.");
            System.out.println("doOperation() failed, not enough permissions, " + LocalDateTime.now());
        }
        return cache;
    }
}
