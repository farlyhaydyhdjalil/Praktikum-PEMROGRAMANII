package soal1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView<Mahasiswa> tableView = new TableView<>();


        TableColumn<Mahasiswa, String> column1 =
                new TableColumn<>("NIM");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> column2 =
                new TableColumn<>("Nama");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("Nama"));

        tableView.getColumns().addAll(column1, column2);

        tableView.getItems().add(
                new Mahasiswa(1, "Hafiz", "2210817210003"));
        tableView.getItems().add(
                new Mahasiswa(2, "Farly", "2210817210006"));
        tableView.getItems().add(
                new Mahasiswa(3, "Ridhani", "2210817310015"));
        tableView.getItems().add(
                new Mahasiswa(4, "Adi", "2210817210017"));
        tableView.getItems().add(
                new Mahasiswa(5, "Abdis", "2210817110005"));
        tableView.getItems().add(
                new Mahasiswa(6, "Ikhsan", "2210817310005"));
        tableView.getItems().add(
                new Mahasiswa(7, "Mario", "2210817310009"));
        tableView.getItems().add(
                new Mahasiswa(8, "Adika", "2210817310004"));
        tableView.getItems().add(
                new Mahasiswa(9, "Anoy", "2210817310018"));
        tableView.getItems().add(
                new Mahasiswa(10, "Ado", "2210817310003"));

        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
