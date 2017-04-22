package com.gkalogiros.websockets;

import javax.websocket.Session;
import java.io.IOException;
import java.util.function.Consumer;

import static java.time.LocalDateTime.now;

public class Event implements Consumer<Session>
{
    @Override
    public void accept(final Session session)
    {
        try
        {
            session.getBasicRemote().sendText(now().toString());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
