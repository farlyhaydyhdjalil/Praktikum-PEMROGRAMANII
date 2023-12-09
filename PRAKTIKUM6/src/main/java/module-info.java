module com.example.praktimum6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens soal1 to javafx.fxml;
    exports soal1;
}