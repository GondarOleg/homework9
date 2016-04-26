package com.epam.builder;

/**
 * Created by o.gondar on 26.04.2016.
 */
public class Run {
    private Run(){
    }
    public static void main(String[] args) {
        Director director = new Director();
        director.setServerBulder(new HPServerBuilder());
        director.constructServer();
        Server hpServer = director.getServer();
        System.out.println(hpServer.getServerName());
        director.setServerBulder(new IBMServerBuilder());
        director.constructServer();
        Server ibmServer = director.getServer();
        System.out.println(ibmServer.getServerName());
    }
}
