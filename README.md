# WebSockets Reference Implemetation
A JSR WebSockets reference implementation using Jetty

## Build

```
gradle build
```

## Run
```
chmod +x run.sh
./run.sh
```

## What to Expect

Once you run the app,  you should be able to see the server sending the current time to two different clients over websockets

```
Session Opened: websocket-1
Client c40abed0-9c7f-4d8a-af1a-dd9e26ca3cca Connected. Session: WebSocketSession[websocket=JsrAnnotatedEventDriver[websocket=com.gkalogiros.websockets.ClientEndpoint@5baf20bb],behavior=CLIENT,connection=WebSocketClientConnection@678a804e{IDLE}{f=Flusher[queueSize=0,aggregateSize=0,failure=null],g=Generator[CLIENT,validating],p=Parser@878fba4[ExtensionStack,s=START,c=0,len=0,f=null,p=WebSocketPolicy@2f02ed06[behavior=CLIENT,maxTextMessageSize=65536,maxTextMessageBufferSize=32768,maxBinaryMessageSize=65536,maxBinaryMessageBufferSize=32768,asyncWriteTimeout=60000,idleTimeout=300000,inputBufferSize=4096]]},remote=WebSocketRemoteEndpoint@68d63909[batching=true],incoming=JsrAnnotatedEventDriver[websocket=com.gkalogiros.websockets.ClientEndpoint@5baf20bb],outgoing=ExtensionStack[queueSize=0,extensions=[],incoming=org.eclipse.jetty.websocket.jsr356.JsrSession,outgoing=org.eclipse.jetty.websocket.client.io.WebSocketClientConnection]]
Client c40abed0-9c7f-4d8a-af1a-dd9e26ca3cca: 2017-04-22T11:43:51.549
Session Opened: websocket-2
Client cef3d290-fb0c-4202-993f-c5b97e3fe204 Connected. Session: WebSocketSession[websocket=JsrAnnotatedEventDriver[websocket=com.gkalogiros.websockets.ClientEndpoint@23f714fb],behavior=CLIENT,connection=WebSocketClientConnection@2d30eef5{IDLE}{f=Flusher[queueSize=0,aggregateSize=0,failure=null],g=Generator[CLIENT,validating],p=Parser@290f7f8b[ExtensionStack,s=START,c=0,len=0,f=null,p=WebSocketPolicy@6c0de4ce[behavior=CLIENT,maxTextMessageSize=65536,maxTextMessageBufferSize=32768,maxBinaryMessageSize=65536,maxBinaryMessageBufferSize=32768,asyncWriteTimeout=60000,idleTimeout=300000,inputBufferSize=4096]]},remote=WebSocketRemoteEndpoint@77c66578[batching=true],incoming=JsrAnnotatedEventDriver[websocket=com.gkalogiros.websockets.ClientEndpoint@23f714fb],outgoing=ExtensionStack[queueSize=0,extensions=[],incoming=org.eclipse.jetty.websocket.jsr356.JsrSession,outgoing=org.eclipse.jetty.websocket.client.io.WebSocketClientConnection]]
Client c40abed0-9c7f-4d8a-af1a-dd9e26ca3cca: 2017-04-22T11:43:54.537
Client cef3d290-fb0c-4202-993f-c5b97e3fe204: 2017-04-22T11:43:56.479
Client c40abed0-9c7f-4d8a-af1a-dd9e26ca3cca: 2017-04-22T11:43:57.541
Client cef3d290-fb0c-4202-993f-c5b97e3fe204: 2017-04-22T11:43:59.478
Client c40abed0-9c7f-4d8a-af1a-dd9e26ca3cca: 2017-04-22T11:44:00.539
```
