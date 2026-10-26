module lab09_danielsavulescu.lab09_danielsavulescu {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens lab09_danielsavulescu.lab09_danielsavulescu to javafx.fxml;
    exports lab09_danielsavulescu.lab09_danielsavulescu;
}
