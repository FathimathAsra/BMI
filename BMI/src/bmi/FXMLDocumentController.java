/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

/**
 *
 * @author MuxAsh
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane fullPane;

    @FXML
    private TextField calbmi;

    @FXML
    private TextField heightfeet;

    @FXML
    private TextField heightinch;

    @FXML
    private TextField weightkg;

    @FXML
    private Button button;

    @FXML
    private Label emptylable;

    @FXML
    private Button btnC;

    @FXML
    private Button btnE;


    @FXML
    void handleButtonAction(ActionEvent event) {
        
        
    
       double weight = Double.parseDouble(weightkg.getText());
       
      double feet = Double.parseDouble(heightfeet.getText());
       
       double inch = Double.parseDouble(heightinch.getText());
       
       double finalheight =(feet*0.3048) + (inch*0.0254);
       
       double bmi = weight /(finalheight*finalheight);
       
       DecimalFormat df = new DecimalFormat("#0.00");
       
       calbmi.setText(String.valueOf(df.format(bmi)));
       
        if(bmi <= 18.5){
            emptylable.setTextFill(Color.BLUE);
            emptylable.setText("UnderWeight");
           

        }
        
        else if (bmi <= 24.9){
            emptylable.setTextFill(Color.GREEN);
            emptylable.setText("NormalWeight");
           
            
        }
        
        else if (bmi <= 29.5){
            emptylable.setTextFill(Color.ORANGE);
            emptylable.setText("OverWeight");
            
        }
        
        else if (bmi >30){
            emptylable.setTextFill(Color.RED);
            emptylable.setText("Obese");
            
        }
    
 
     }        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //
    }

}

