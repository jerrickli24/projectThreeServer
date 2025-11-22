import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server {
    
    private ServerSocket serverSocket;
    private int port;
    private ArrayList<ClientHandler> clientThreads;
    private boolean isRunning;
    private int clientCount;
    private ServerController controller;
    
    public Server(int port, ServerController controller) {
        this.port = port;
        this.controller = controller;
        this.clientThreads = new ArrayList<>();
        this.isRunning = false;
        this.clientCount = 0;
    }
    
    public void startServer() {
        isRunning = true;
        
        // need to make a new thread so server doesn't block the GUI
        Thread serverThread = new Thread(() -> {
            try {
                // create the server socket with the port
                
                // keep accepting clients while running
                while(isRunning) {
                    // accept a client connection
                    
                    // increment client count
                    
                    // make a ClientHandler for this client
                    
                    // add it to the list
                    
                    // start the client handler on its own thread
                    
                    // update the GUI
                }
            } catch(Exception e) {
                // handle errors
            }
        });
        
        serverThread.start();
    }
    
    public void stopServer() {
        isRunning = false;
        
        try {
            // close all client connections
            
            // close the server socket
            
            // clear the list
            
        } catch(Exception e) {
            // handle exception
        }
    }
    
    public void removeClient(ClientHandler ch) {
        clientThreads.remove(ch);
        controller.updateClientCount(clientThreads.size());
        // tell controller that client disconnected
    }
    
    public int getClientCount() {
        return clientThreads.size();
    }
    
    public ServerController getController() {
        return controller;
    }
}