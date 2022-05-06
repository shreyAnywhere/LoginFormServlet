package com.example;


import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.ServletHandler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        //System.out.println( "Hello World!" );
        Server server = new Server(8080);

        ServletHandler handler = new ServletHandler();
        handler.addServletWithMapping(PingHandler.class, "/ping");
        handler.addServletWithMapping(Login.class, "/login");
        handler.addServletWithMapping(LoggedIn.class, "/loggedIn");

        server.setHandler(handler);


        server.start();
        server.join();


    }
}
