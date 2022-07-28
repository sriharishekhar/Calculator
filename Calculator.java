import javafx.application.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public Label disp;
    public String str = "0";
    public char lastOp = ' ';
    public double res = 0;

    public void start(Stage myStage) {

        myStage.setTitle("JavaFX Calculator");
        disp = new Label();
        disp.setAlignment(Pos.CENTER);

        GridPane gP = new GridPane();
        gP.setPadding(new Insets(20, 0, 20, 0));
        gP.setVgap(5);
        gP.setHgap(5);

        Button button1 = new Button("<");
        button1.setPrefSize(50, 50);
        button1.setOnAction(hnd);
        button1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button2 = new Button("AC");
        button2.setPrefSize(50, 50);
        button2.setOnAction(hnd);
        button2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button3 = new Button("%");
        button3.setPrefSize(50, 50);
        button3.setOnAction(hnd);
        button3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button4 = new Button("7");
        button4.setPrefSize(50, 50);
        button4.setOnAction(hnd);
        button4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button5 = new Button("8");
        button5.setPrefSize(50, 50);
        button5.setOnAction(hnd);
        button5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button6 = new Button("9");
        button6.setPrefSize(50, 50);
        button6.setOnAction(hnd);
        button6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button7 = new Button("/");
        button7.setPrefSize(50, 50);
        button7.setOnAction(hnd);
        button7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button8 = new Button("4");
        button8.setPrefSize(50, 50);
        button8.setOnAction(hnd);
        button8.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button9 = new Button("5");
        button9.setPrefSize(50, 50);
        button9.setOnAction(hnd);
        button9.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button10 = new Button("6");
        button10.setPrefSize(50, 50);
        button10.setOnAction(hnd);
        button10.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button11 = new Button("-");
        button11.setPrefSize(50, 50);
        button11.setOnAction(hnd);
        button11.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button12 = new Button("1");
        button12.setPrefSize(50, 50);
        button12.setOnAction(hnd);
        button12.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button13 = new Button("2");
        button13.setPrefSize(50, 50);
        button13.setOnAction(hnd);
        button13.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button14 = new Button("3");
        button14.setPrefSize(50, 50);
        button14.setOnAction(hnd);
        button14.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button15 = new Button("*");
        button15.setPrefSize(50, 50);
        button15.setOnAction(hnd);
        button15.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button16 = new Button(".");
        button16.setPrefSize(50, 50);
        button16.setOnAction(hnd);
        button16.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button17 = new Button("0");
        button17.setPrefSize(50, 50);
        button17.setOnAction(hnd);
        button17.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button18 = new Button("+");
        button18.setPrefSize(50, 50);
        button18.setOnAction(hnd);
        button18.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        Button button19 = new Button("=");
        button19.setPrefSize(50, 50);
        button19.setOnAction(hnd);
        button19.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        gP.add(button1, 1, 0);
        gP.add(button2, 2, 0);
        gP.add(button3, 3, 0);

        gP.add(button4, 0, 1);
        gP.add(button5, 1, 1);
        gP.add(button6, 2, 1);
        gP.add(button7, 3, 1);

        gP.add(button8, 0, 2);
        gP.add(button9, 1, 2);
        gP.add(button10, 2, 2);
        gP.add(button11, 3, 2);

        gP.add(button12, 0, 3);
        gP.add(button13, 1, 3);
        gP.add(button14, 2, 3);
        gP.add(button15, 3, 3);

        gP.add(button16, 0, 4);
        gP.add(button17, 1, 4);
        gP.add(button18, 2, 4);
        gP.add(button19, 3, 4);

        RadioButton radioButton1 = new RadioButton("On");
        RadioButton radioButton2 = new RadioButton("Off");
        radioButton1.setSelected(true);
        radioButton2.setOnAction(e -> {
            radioButton1.setSelected(false);
                button1.setDisable(true);
                button2.setDisable(true);
                button3.setDisable(true);
                button4.setDisable(true);
                button5.setDisable(true);
                button6.setDisable(true);
                button7.setDisable(true);
                button8.setDisable(true);
                button9.setDisable(true);
                button10.setDisable(true);
                button11.setDisable(true);
                button12.setDisable(true);
                button13.setDisable(true);
                button14.setDisable(true);
                button15.setDisable(true);
                button16.setDisable(true);
                button17.setDisable(true);
                button18.setDisable(true);
                button19.setDisable(true);
            radioButton1.setDisable(false);
            disp.setText("");
        });
        radioButton1.setOnAction(e -> {
            radioButton2.setSelected(false);
                button1.setDisable(false);
                button2.setDisable(false);
                button3.setDisable(false);
                button4.setDisable(false);
                button5.setDisable(false);
                button6.setDisable(false);
                button7.setDisable(false);
                button8.setDisable(false);
                button9.setDisable(false);
                button10.setDisable(false);
                button11.setDisable(false);
                button12.setDisable(false);
                button13.setDisable(false);
                button14.setDisable(false);
                button15.setDisable(false);
                button16.setDisable(false);
                button17.setDisable(false);
                button18.setDisable(false);
                button19.setDisable(false);
            radioButton2.setDisable(false);
        });

        BorderPane rootNode = new BorderPane();
        rootNode.setTop(disp);
        rootNode.setPadding(new Insets(20, 20, 20, 20));
        rootNode.setLeft(new VBox(radioButton1, radioButton2));
        radioButton1.setAlignment(Pos.TOP_LEFT);
        radioButton2.setAlignment(Pos.TOP_LEFT);
        rootNode.setCenter(gP);

        Scene myScene = new Scene(rootNode,300,300);
        myStage.setScene(myScene);
        myStage.show();
    }
    EventHandler hnd = evt -> {
        String cbt = ((Button) evt.getSource()).getText();
        switch (cbt) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                if (str.equals("0")) {
                    str = cbt;
                } else {
                    str += cbt;
                }
                disp.setText(str);
                if (lastOp == '=') {
                    res = 0;
                    lastOp = ' ';
                }
                break;
            case "AC":
                res = 0;
                str = "0";
                lastOp = ' ';
                disp.setText("0");
                break;
            case "<":
                disp.setText(str = str.substring(0, str.length() - 1));
            case "=":
                Calc();
                lastOp = '=';
                break;
            case "+":
                Calc();
                lastOp = '+';
                break;
            case "/":
                Calc();
                lastOp = '/';
                break;
            case "-":
                Calc();
                lastOp = '-';
                break;
            case "x":
                Calc();
                lastOp = '*';
                break;
            case "%":
                Calc();
                lastOp = '%';
                break;
        }
    };

    public void Calc() {
        double x = Double.parseDouble(str);
        str = "0";
        if (lastOp == ' ') {
            res = x;
        } else if (lastOp == '/') {
            res /= x;
        } else if (lastOp == '+') {
            res += x;
        }  else if (lastOp == '%') {
            res %= x;
        } else if (lastOp == '-') {
            res -= x;
        } else if (lastOp == '*') {
            res *= x;
        } else if (lastOp == '=') {
        }
        disp.setText(res + "");
    }
}