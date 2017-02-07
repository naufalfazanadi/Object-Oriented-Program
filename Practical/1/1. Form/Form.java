import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Form extends Application {
  @Override public void start (Stage stage) {

    /* Make 1st Scene */
    Group root1 = new Group();
    Scene scene1 = new Scene(root1, 300, 400);

    /* Make form for input */
    // FIRST NAME
    Label fName = new Label("First Name");
    fName.setLayoutX(30);
    fName.setLayoutY(40);
    root1.getChildren().add(fName);

    TextField tfFname = new TextField();
    tfFname.setLayoutX(130);
    tfFname.setLayoutY(40);
    root1.getChildren().add(tfFname);

    // LAST NAME
    Label lName = new Label("Last Name");
    lName.setLayoutX(30);
    lName.setLayoutY(80);
    root1.getChildren().add(lName);

    TextField tfLname = new TextField();
    tfLname.setLayoutX(130);
    tfLname.setLayoutY(80);
    root1.getChildren().add(tfLname);

    // GENDER
    Label lGender = new Label("Gender (M/F)");
    lGender.setLayoutX(30);
    lGender.setLayoutY(120);
    root1.getChildren().add(lGender);

    TextField tfGender = new TextField();
    tfGender.setLayoutX(130);
    tfGender.setLayoutY(120);
    root1.getChildren().add(tfGender);

    // USERNAME
    Label lUname = new Label("Username");
    lUname.setLayoutX(30);
    lUname.setLayoutY(160);
    root1.getChildren().add(lUname);

    TextField tfUname = new TextField();
    tfUname.setLayoutX(130);
    tfUname.setLayoutY(160);
    root1.getChildren().add(tfUname);

    // PASSWORD
    Label lPass = new Label("Password");
    lPass.setLayoutX(30);
    lPass.setLayoutY(200);
    root1.getChildren().add(lPass);

    PasswordField pass = new PasswordField();
    pass.setLayoutX(130);
    pass.setLayoutY(200);
    root1.getChildren().add(pass);

    /* Button For Login */
    Button bLogin = new Button("Masuk");
    bLogin.setLayoutX(130);
    bLogin.setLayoutY(240);
    root1.getChildren().add(bLogin);

    /* Make 2nd Scene */
    Group root2 = new Group();
    Scene scene2 = new Scene(root2, 300, 400);

    Label masukF = new Label("Selamat Datang, Mbak!");
    masukF.setLayoutX(100);
    masukF.setLayoutY(100);

    Label masukM = new Label("Selamat Datang, Mas!");
    masukM.setLayoutX(100);
    masukM.setLayoutY(100);

    /* Make 3rd Scene */
    Group root3 = new Group();
    Scene scene3 = new Scene(root3, 300, 400);

    Label gmasuk = new Label("Gender tidak terdefinisi.");
    gmasuk.setLayoutX(40);
    gmasuk.setLayoutY(40);
    root3.getChildren().add(gmasuk);

    Label gmasuk2 = new Label("Silahkan coba kembali.");
    gmasuk2.setLayoutX(40);
    gmasuk2.setLayoutY(60);
    root3.getChildren().add(gmasuk2);

    bLogin.setOnAction(new EventHandler<ActionEvent>() {
      @Override
        public void handle(ActionEvent e) {
          // MALE
          if (tfGender.getText().equals("M")) {
            root2.getChildren().add(masukM);
            stage.setScene(scene2);
          // FEMALE
          } else if (tfGender.getText().equals("F")) {
            root2.getChildren().add(masukF);
            stage.setScene(scene2);
          // ELSE NOT 2 OF THEM
          } else {
            stage.setScene(scene3);
          }
        }
    });

    stage.setScene(scene1);
    stage.sizeToScene();
    stage.show();

  }

  public static void main (String[] args) {
    Application.launch(args);
  }
}