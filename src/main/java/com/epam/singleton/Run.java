package com.epam.singleton;

/**
 * Created by o.gondar on 26.04.2016.
 */
public class Run {
    private Run() {
    }

    public static void main(String[] args) {

        CommonConfiguration.getInstance().setProperty("test", "testPropertyValue");
        System.out.println(CommonConfiguration.getInstance().getProperty("test"));


    }
}
