package truthTableTester;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import static com.sun.javafx.application.PlatformImpl.exit;

public class Controller implements Initializable {

    public ComboBox<String> variableOneBox;
    public ComboBox<String> variableTwoBox;
    public ComboBox<String> logicalOperationBox;
    public Label labelResult;
    public Label labelV1;
    public Label labelOperation;
    public Label labelV2;
    public Label labelEqualSign;
    public Label labelResultV;
    public Button btnGetResult;

    //Truth Table variables
    public Label labelTruthTableName;
    public Label labelVar1;
    public Label labelVar2;
    public Label labelVarResult12;
    public Label labelVar3;
    public Label labelVar4;
    public Label labelVarResult34;
    public Label labelVar5;
    public Label labelVar6;
    public Label labelVarResult56;
    public Label labelVar7;
    public Label labelVar8;
    public Label labelVarResult78;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        variableOneBox.setItems(FXCollections.observableArrayList("True","False"));
        variableTwoBox.setItems(FXCollections.observableArrayList("True","False"));
        logicalOperationBox.setItems(FXCollections.observableArrayList("AND","OR","IF","Bi-Conditional"));
        labelResult.setVisible(false);
        labelV1.setVisible(false);
        labelV2.setVisible(false);
        labelOperation.setVisible(false);
        labelEqualSign.setVisible(false);
        labelResultV.setVisible(false);
        labelTruthTableName.setVisible(false);
    }

    public void alertNotify(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText("Operation Unsuccessful");
        alert.setContentText("Please check the missing options");
        alert.show();

    }

    public void getResult(){

        String detectLogicalOperation = logicalOperationBox.getValue();
        String getV1 = variableOneBox.getValue();
        String getV2 = variableTwoBox.getValue();

        if(logicalOperationBox.getValue()==null || variableOneBox.getValue()==null || variableTwoBox.getValue()==null){
            alertNotify();
        }

        //AND Operation
        if(detectLogicalOperation.equals("AND")){

            clearTable();

            if(getV1.equals("True") && getV2.equals("True")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("TRUE");

                labelOperation.setVisible(true);
                labelOperation.setText("∧");

                labelV2.setVisible(true);
                labelV2.setText("TRUE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("TRUE");

            }

            if(getV1.equals("True") && getV2.equals("False")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("TRUE");

                labelOperation.setVisible(true);
                labelOperation.setText("∧");

                labelV2.setVisible(true);
                labelV2.setText("FALSE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("FALSE");
            }

            if(getV1.equals("False") && getV2.equals("True")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("FALSE");

                labelOperation.setVisible(true);
                labelOperation.setText("∧");

                labelV2.setVisible(true);
                labelV2.setText("TRUE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("FALSE");
            }

            if(getV1.equals("False") && getV2.equals("False")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("FALSE");

                labelOperation.setVisible(true);
                labelOperation.setText("∧");

                labelV2.setVisible(true);
                labelV2.setText("FALSE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("FALSE");
            }
        }

        //OR Operation
        else if(detectLogicalOperation.equals("OR")){

            clearTable();

            if(getV1.equals("True") && getV2.equals("True")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("TRUE");

                labelOperation.setVisible(true);
                labelOperation.setText("∨");

                labelV2.setVisible(true);
                labelV2.setText("TRUE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("TRUE");

            }

            if(getV1.equals("True") && getV2.equals("False")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("TRUE");

                labelOperation.setVisible(true);
                labelOperation.setText("∨");

                labelV2.setVisible(true);
                labelV2.setText("FALSE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("TRUE");

            }

            if(getV1.equals("False") && getV2.equals("True")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("FALSE");

                labelOperation.setVisible(true);
                labelOperation.setText("∨");

                labelV2.setVisible(true);
                labelV2.setText("TRUE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("TRUE");

            }

            if(getV1.equals("False") && getV2.equals("False")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("FALSE");

                labelOperation.setVisible(true);
                labelOperation.setText("∨");

                labelV2.setVisible(true);
                labelV2.setText("FALSE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("FALSE");

            }
        }

        //IF Operation
        else if(detectLogicalOperation.equals("IF")){

            clearTable();

            if(getV1.equals("True") && getV2.equals("True")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("TRUE");

                labelOperation.setVisible(true);
                labelOperation.setText("->");

                labelV2.setVisible(true);
                labelV2.setText("TRUE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("TRUE");

            }

            if(getV1.equals("True") && getV2.equals("False")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("TRUE");

                labelOperation.setVisible(true);
                labelOperation.setText("->");

                labelV2.setVisible(true);
                labelV2.setText("FALSE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("FALSE");

            }

            if(getV1.equals("False") && getV2.equals("True")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("FALSE");

                labelOperation.setVisible(true);
                labelOperation.setText("->");

                labelV2.setVisible(true);
                labelV2.setText("TRUE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("TRUE");

            }

            if(getV1.equals("False") && getV2.equals("False")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("FALSE");

                labelOperation.setVisible(true);
                labelOperation.setText("->");

                labelV2.setVisible(true);
                labelV2.setText("FALSE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("TRUE");

            }
        }

        //Bi-Conditional Operation
        else if(detectLogicalOperation.equals("Bi-Conditional")){

            clearTable();

            if(getV1.equals("True") && getV2.equals("True")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("TRUE");

                labelOperation.setVisible(true);
                labelOperation.setText("<->");

                labelV2.setVisible(true);
                labelV2.setText("TRUE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("TRUE");

            }

            if(getV1.equals("True") && getV2.equals("False")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("TRUE");

                labelOperation.setVisible(true);
                labelOperation.setText("<->");

                labelV2.setVisible(true);
                labelV2.setText("FALSE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("FALSE");

            }

            if(getV1.equals("False") && getV2.equals("True")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("FALSE");

                labelOperation.setVisible(true);
                labelOperation.setText("<->");

                labelV2.setVisible(true);
                labelV2.setText("TRUE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("FALSE");

            }

            if(getV1.equals("False") && getV2.equals("False")){
                labelResult.setVisible(true);

                labelV1.setVisible(true);
                labelV1.setText("FALSE");

                labelOperation.setVisible(true);
                labelOperation.setText("<->");

                labelV2.setVisible(true);
                labelV2.setText("FALSE");

                labelEqualSign.setVisible(true);

                labelResultV.setVisible(true);
                labelResultV.setText("TRUE");

            }
        }

    }

    public void revealTable(){

        String detectLogicalOperation = logicalOperationBox.getValue().toString();

        //Reveals Truth Table of AND
        if(detectLogicalOperation.equals("AND")) {

            labelTruthTableName.setVisible(true);
            labelTruthTableName.setText("(AND)");

            labelVar1.setText("T");
            labelVar2.setText("T");
            labelVarResult12.setText("T");

            labelVar3.setText("T");
            labelVar4.setText("F");
            labelVarResult34.setText("F");

            labelVar5.setText("F");
            labelVar6.setText("T");
            labelVarResult56.setText("F");

            labelVar7.setText("F");
            labelVar8.setText("F");
            labelVarResult78.setText("F");
        }

        //Reveals Truth Table of OR
        else if(detectLogicalOperation.equals("OR")){

            labelTruthTableName.setVisible(true);
            labelTruthTableName.setText("(OR)");

            labelVar1.setText("T");
            labelVar2.setText("T");
            labelVarResult12.setText("T");

            labelVar3.setText("T");
            labelVar4.setText("F");
            labelVarResult34.setText("T");

            labelVar5.setText("F");
            labelVar6.setText("T");
            labelVarResult56.setText("T");

            labelVar7.setText("F");
            labelVar8.setText("F");
            labelVarResult78.setText("F");
        }

        //Reveals Truth Table of IF
        else if(detectLogicalOperation.equals("IF")) {

            labelTruthTableName.setVisible(true);
            labelTruthTableName.setText("(IF)");

            labelVar1.setText("T");
            labelVar2.setText("T");
            labelVarResult12.setText("T");

            labelVar3.setText("T");
            labelVar4.setText("F");
            labelVarResult34.setText("F");

            labelVar5.setText("F");
            labelVar6.setText("T");
            labelVarResult56.setText("T");

            labelVar7.setText("F");
            labelVar8.setText("F");
            labelVarResult78.setText("T");

        }

        //Reveals Truth Table if Bi-Conditional
        else if(detectLogicalOperation.equals("Bi-Conditional")) {

            labelTruthTableName.setVisible(true);
            labelTruthTableName.setText("(Bi-Conditional)");

            labelVar1.setText("T");
            labelVar2.setText("T");
            labelVarResult12.setText("T");

            labelVar3.setText("T");
            labelVar4.setText("F");
            labelVarResult34.setText("F");

            labelVar5.setText("F");
            labelVar6.setText("T");
            labelVarResult56.setText("F");

            labelVar7.setText("F");
            labelVar8.setText("F");
            labelVarResult78.setText("T");

        }
    }

    public void refresh(){

        labelResult.setVisible(false);
        labelV1.setVisible(false);
        labelV2.setVisible(false);
        labelOperation.setVisible(false);
        labelEqualSign.setVisible(false);
        labelResultV.setVisible(false);

        labelTruthTableName.setVisible(false);
        labelVar1.setText("");
        labelVar2.setText("");
        labelVarResult12.setText("");
        labelVar3.setText("");
        labelVar4.setText("");
        labelVarResult34.setText("");
        labelVar5.setText("");
        labelVar6.setText("");
        labelVarResult56.setText("");
        labelVar7.setText("");
        labelVar8.setText("");
        labelVarResult78.setText("");


    }

    public void clearTable(){

        labelTruthTableName.setVisible(false);
        labelVar1.setText("");
        labelVar2.setText("");
        labelVarResult12.setText("");
        labelVar3.setText("");
        labelVar4.setText("");
        labelVarResult34.setText("");
        labelVar5.setText("");
        labelVar6.setText("");
        labelVarResult56.setText("");
        labelVar7.setText("");
        labelVar8.setText("");
        labelVarResult78.setText("");

    }
}
