package com.gkalogiros.websockets;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.websocket.jsr356.server.deploy.WebSocketServerContainerInitializer;

import javax.websocket.server.ServerContainer;

public class SocketServer implements Runnable
{
    @Override
    public void run()
    {
        final Server server = new Server();

        final ServerConnector connector = new ServerConnector(server);
        connector.setPort(8082);

        final ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        server.addConnector(connector);
        server.setHandler(context);

        try
        {
            final ServerContainer wscontainer = WebSocketServerContainerInitializer.configureContext(context);

//            wscontainer.addEndpoint(ServerEndpointConfig.Builder
//                    .create(TopicSocket.class, "/topic/")
//                    .configurator(new Configurator(new Event()))
//                    .build());

            wscontainer.addEndpoint(TopicSocket.class);

            server.start();
            server.dump(System.err);
            server.join();
        }
        catch (Throwable t)
        {
            t.printStackTrace(System.err);
        }
    }
}
