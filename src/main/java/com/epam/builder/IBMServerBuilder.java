package com.epam.builder;

/**
 * Created by o.gondar on 26.04.2016.
 */
public class IBMServerBuilder extends ServerBulder {

    @Override
    public void buildBrandName() {
        server.setServerName("IBM server");
    }
}
