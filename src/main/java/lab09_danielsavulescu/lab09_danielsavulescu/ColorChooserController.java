package lab09_danielsavulescu.lab09_danielsavulescu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author 2540408
 */
public class ColorChooserController implements Initializable {


    @FXML
    private Slider greenSlider;
    @FXML
    private Slider redSlider;
    @FXML
    private Slider blueSlider;
    @FXML
    private Slider alphaSlider;
    @FXML
    private TextField redTextField;
    @FXML
    private TextField greenTextField;
    @FXML
    private TextField blueTextField;
    @FXML
    private TextField alphaTextField;
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
