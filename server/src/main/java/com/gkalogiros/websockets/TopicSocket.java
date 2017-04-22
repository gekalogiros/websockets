package com.gkalogiros.websockets;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@ServerEndpoint(value = "/topic/")
public class TopicSocket
{
    private final Queue<Session> sessions = new ConcurrentLinkedQueue<>();

    public TopicSocket()
    {
        new EventScheduler(this.sessions).start(new Event());
    }

    @OnOpen
    public void onOpen(final Session session)
    {
        sessions.add(session);
        System.out.println("Session Opened: " + session.getId());
    }

    @OnError
    public void onError(final Session session, final Throwable t)
    {
        sessions.remove(session);
        System.err.println("Error on Session " + session.getId());
    }

    @OnClose
    public void onClose(final Session session)
    {
        sessions.remove(session);
        System.out.println("Session " + session.getId() + " has ended");
    }
}