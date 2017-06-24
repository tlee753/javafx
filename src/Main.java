// Application
import javafx.application.Application;

// Scene
import javafx.geometry.Insets;
import javafx.scene.Scene;

// Stage
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

// Events
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

// Elements
import javafx.scene.control.Button;
import javafx.scene.control.Label;

// Layouts


public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("tlee753");
        window.setOnCloseRequest(e -> {
            // e.consume(); // we are going to take care of the closing (manual controls)
            closeProgram();
        }); // method called when application is closed

        TextField inputText = new TextField();
        Button button1 = new Button("Click Me");

        button1.setOnAction(e -> {
            // System.out.println(inputText.getCharacters()); // typically want to validate
            verifyInteger(inputText, inputText.getText());
        });

        VBox layout = new VBox(10); // spacing between elements
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(inputText, button1);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    private boolean verifyInteger(TextField inputField, String input) {
        try{
            int age = Integer.parseInt(inputField.getText());
            System.out.println("User is " + age);
            return true;
        }catch(NumberFormatException e){
            System.out.println("Error " + input + " is not a number.");
            return false;
        }
    }

    private void closeProgram(){
        /*
        boolean answer = ConfirmBox.display("ConfirmBox Title", "Sure you want to exit?");
        if(answer)
            window.close();
        */
        System.out.println("Program closed");
    }

/*
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("tlee753");
        window.setOnCloseRequest(e -> {
            // e.consume(); // we are going to take care of the closing (manual controls)
            closeProgram();
        }); // method called when application is closed

    GridPane grid = new GridPane();
            grid.setPadding(new Insets(10, 10, 10, 10)); // 10 px padding around layout and window
            grid.setVgap(10); // vertical spacing between cells
            grid.setHgap(10); // horizontal spacing between cells

        Label nameLabel = new Label("Username: ");
            GridPane.setConstraints(nameLabel, 0, 0); // top left of grid

        TextField nameInput = new TextField("Tyler");
            nameInput.setPromptText("Username");
            GridPane.setConstraints(nameInput, 1, 0);

        Label passwordLabel = new Label("Password: ");
            GridPane.setConstraints(passwordLabel, 0, 1);

        TextField passwordInput = new TextField();
            passwordInput.setPromptText("Password");
            GridPane.setConstraints(passwordInput, 1, 1);

        Button loginButton = new Button("Login");
            GridPane.setConstraints(loginButton, 1, 2);

            grid.getChildren().addAll(nameLabel, nameInput, passwordLabel, passwordInput, loginButton);

        Scene scene = new Scene(grid, 300, 300);
            window.setScene(scene);
            window.show();
    }
 */


/*
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("tlee753");
        window.setOnCloseRequest(e -> {
            e.consume(); // we are going to take care of the closing (manual controls)
            closeProgram();
        }); // method called when application is closed



    HBox topMenu = new HBox();
    Button button1 = new Button("File");
    Button button2 = new Button("Edit");
    Button button3 = new Button("View");
        topMenu.getChildren().addAll(button1, button2, button3);

    VBox leftMenu = new VBox();
    Button button4 = new Button("Option 1");
    Button button5 = new Button("Option 2");
    Button button6 = new Button("Option 3");
        leftMenu.getChildren().addAll(button4, button5, button6);

    BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

    Scene scene = new Scene(borderPane , 200, 200);
        window.setScene(scene);
        window.show();
    }
 */


/*
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("My Title");

        // Elements
        Button button1 = new Button("Click Me");
        button1.setOnAction(e -> System.out.println("CLICKED"));
        Label label1 = new Label("this is a label");

        // Layout
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);

        // Scene
        scene1 = new Scene(layout1, 300, 300);

        window.setScene(scene1);
        window.show();
    }
*/

/*
 * Stage (window)
 *     only one but scene within it can change
 * Scene
 *     takes in the layout
 * Stackpage (layout)
 *     layout takes in elements (buttons/labels/etc)
*/

/*
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button("Go to Scene two");
        button1.setOnAction(e -> window.setScene(scene2));

        // Layout 1 - children laid out in vertical column
        VBox layout1 = new VBox(20); // layout that stacks all objects on top of each other
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);


        Button button2 = new Button("Go to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        // Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 500, 600);

        window.setScene(scene1);
        window.setTitle("My Title");
        window.show();
    }
*/

/*
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Window");
        button = new Button();
        button.setText("Click Me");

        // This class will handle button events (anonymous inner class
            // don't have to check event source like before
        button.setOnAction(e -> System.out.println("Hey now"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
*/
}