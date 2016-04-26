package com.epam.builder;

/**
 * Created by o.gondar on 26.04.2016.
 */
public class Director {

    private ServerBulder serverBulder;

    public void setServerBulder(ServerBulder serverBulder){
        this.serverBulder = serverBulder;
    }

    public Server getServer(){
        return serverBulder.getServer();
    }

    public void constructServer(){
        serverBulder.createNewServer();
        serverBulder.buildBrandName();
    }

}
