package com.gkalogiros.websockets;

import javax.websocket.ContainerProvider;
import javax.websocket.WebSocketContainer;
import java.net.URI;

import static java.util.UUID.randomUUID;

public class SocketClient implements Runnable
{
    @Override
    public void run()
    {
        URI uri = URI.create("ws://localhost:8082/topic/");

        try
        {
            final WebSocketContainer container = ContainerProvider.getWebSocketContainer();

            container.connectToServer(new ClientEndpoint(randomUUID()), uri);
        }
        catch (Throwable t)
        {
            t.printStackTrace(System.err);
        }
    }
}
