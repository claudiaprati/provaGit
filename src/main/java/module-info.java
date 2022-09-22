module it.edu.perlasca.provagit {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.edu.perlasca.provagit to javafx.fxml;
    exports it.edu.perlasca.provagit;
}