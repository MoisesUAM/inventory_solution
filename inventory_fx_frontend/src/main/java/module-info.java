module net.mcoto {
    requires javafx.controls;
    requires javafx.fxml;

    opens net.mcoto to javafx.fxml;
    exports net.mcoto;
}
