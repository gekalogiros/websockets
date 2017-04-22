package com.gkalogiros.websockets;

import javax.websocket.Session;
import java.util.Queue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;

import static java.util.concurrent.TimeUnit.SECONDS;

class EventScheduler
{
    private static final ScheduledExecutorService SCHEDULER = Executors.newSingleThreadScheduledExecutor();

    private final Queue<Session> sessions;

    EventScheduler(final Queue<Session> sessions)
    {
        this.sessions = sessions;
    }

    void start(final Consumer<Session> c)
    {
        SCHEDULER.scheduleAtFixedRate(() -> sessions.forEach(c), 3, 3, SECONDS);
    }
}
