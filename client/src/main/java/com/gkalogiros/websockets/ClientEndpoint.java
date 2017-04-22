package com.gkalogiros.websockets;

import javax.websocket.*;
import java.util.UUID;

@javax.websocket.ClientEndpoint
public class ClientEndpoint
{
    private final String id;

    public ClientEndpoint(UUID uuid)
    {
        this.id = uuid.toString();
    }

    @OnOpen
    public void onOpen(final Session session)
    {
        System.out.println("Client " + id + " Connected. Session: " + session);
    }

    @OnMessage
    public void onMessage(final String message)
    {
        System.out.println("Client " + id + ": " + message);
    }

    @OnClose
    public void onClose(final CloseReason reason)
    {
        System.out.println("Client " + id + " Closed: " + reason);
    }

    @OnError
    public void onError(final Throwable t)
    {
        t.printStackTrace(System.err);
    }
}
