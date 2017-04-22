package com.gkalogiros.websockets;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

class Application
{
    private static final int DELAY = 5;

    private final ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);

    private void run()
    {
        executor.submit(new SocketServer());

        executor.schedule(new SocketClient(), DELAY, SECONDS);

        executor.schedule(new SocketClient(), DELAY * 2 , SECONDS);
    }

    public static void main(String[] args)
    {
        final Application app = new Application();

        app.run();
    }
}
