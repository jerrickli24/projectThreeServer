import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable {
    
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private int clientId;
    private Deck deck;
    private ThreeCardLogic gameLogic;
    private boolean isPlaying;
    private Server server;
    
    public ClientHandler(Socket socket, int clientId, Server server) {
        this.socket = socket;
        this.clientId = clientId;
        this.server = server;
        this.deck = new Deck();
        this.gameLogic = new ThreeCardLogic();
        this.isPlaying = true;
    }
    
    @Override
    public void run() {
        try {
            // set up the output stream first!!
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            
            // keep reading messages from the client
            while(isPlaying) {
                // read PokerInfo from client
                
                // process it and get response
                
                // send response back
            }
            
        } catch(Exception e) {
            System.out.println("Error with client " + clientId);
        } finally {
            closeConnection();
        }
    }
    
    public PokerInfo processClientRequest(PokerInfo info) {
        // figure out what the client wants
        // if playerHand is null, they're placing bets and need cards dealt
        // otherwise they're playing or folding
        
        return null;
    }
    
    public PokerInfo dealCards(PokerInfo info) {
        // reset and shuffle the deck
        
        // deal 3 cards to player
        
        // deal 3 cards to dealer
        
        // put them in the PokerInfo object
        
        // log it to the server GUI
        
        return info;
    }
    
    public PokerInfo evaluateGame(PokerInfo info) {
        // first check the pair plus bet if they made one
        
        // then check if dealer qualifies (has at least Queen high)
        
        // if dealer doesn't qualify, ante bet is pushed
        
        // if dealer qualifies, compare the hands
        
        // calculate winnings based on who won
        
        // log everything to server GUI
        
        return info;
    }
    
    public void closeConnection() {
        try {
            isPlaying = false;
            // close all the streams
            // close socket
            // remove from server list
        } catch(Exception e) {
            // already closed probably
        }
    }
    
    public int getClientId() {
        return clientId;
    }
}