package lab09_danielsavulescu.lab09_danielsavulescu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
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
    @FXML
    private Rectangle rectangle;
    
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        redTextField.textProperty().bind(redSlider.valueProperty().asString("%.0f"));
        blueTextField.textProperty().bind(blueSlider.valueProperty().asString("%.0f"));
        greenTextField.textProperty().bind(greenSlider.valueProperty().asString("%.0f"));
        alphaTextField.textProperty().bind(alphaSlider.valueProperty().asString("%.2f"));
        
        redSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            red = newValue.intValue();
            updateColor();
        });
        
        greenSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            green = newValue.intValue();
            updateColor();
        });
        
        blueSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            blue = newValue.intValue();
            updateColor();
        });
        
        alphaSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            alpha = newValue.doubleValue();
            updateColor();
        });
    }
    
    /**
     * updateColor method that updates the color of the rectangle
     */
    private void updateColor() {
        Color color = Color.rgb(
                (int) red,
                (int) green,
                (int) blue,
                alpha);
        rectangle.setFill(color);
    }
}
