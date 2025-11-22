import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.application.Platform;

public class ServerController {
    
    @FXML
    private TextField portField;
    
    @FXML
    private Button startButton;
    
    @FXML
    private Button stopButton;
    
    @FXML
    private Label clientCountLabel;
    
    @FXML
    private ListView<String> gameInfoList;
    
    private Server server;
    
    @FXML
    public void initialize() {
        // set up the initial state of buttons here
        // maybe disable the stop button at first?
    }
    
    @FXML
    public void handleStartServer() {
        // get the port number from portField
        
        // make a new Server object
        
        // call startServer
        
        // disable start button and enable stop button
        
        // add message to the list view
    }
    
    @FXML
    public void handleStopServer() {
        // stop the server if its running
        
        // enable start and disable stop
    }
    
    public void updateClientCount(int count) {
        // this needs Platform.runLater because it's called from another thread
        // update clientCountLabel with the new count
    }
    
    public void addGameInfo(String message) {
        // this also needs Platform.runLater
        // add the message to gameInfoList
    }
}