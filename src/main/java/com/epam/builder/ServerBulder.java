package com.epam.builder;

/**
 * Created by o.gondar on 26.04.2016.
 */
public abstract class ServerBulder {

    protected Server server;

    public Server getServer(){
        return server;
    }

    public void createNewServer(){
        server = new Server();
    }

    public abstract void buildBrandName();

}
