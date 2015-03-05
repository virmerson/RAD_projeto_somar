/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxlayout;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author rf3020
 */
public class FXMLDocumentController {

    @FXML
    private Text txtMensagem;
    @FXML
    private TextField tfN1;
    @FXML
    private TextField tfN2;
    
    @FXML
    private ChoiceBox cbOperacoes;

    @FXML
    protected void calcular(ActionEvent event) {
        
        Double n1 = Double.parseDouble(tfN1.getText());
        Double n2 = Double.parseDouble(tfN2.getText());
        
        Double res=0.0;
        
        if (cbOperacoes.getValue().toString().equals("Somar")){
            res = Calculadora.somar(n1, n2);
        }else if (cbOperacoes.getValue().toString().equals("Subtrair")) {
            res =  Calculadora.subtrair(n1,n2);
        }
        
        txtMensagem.setText(res.toString());
    }

}
