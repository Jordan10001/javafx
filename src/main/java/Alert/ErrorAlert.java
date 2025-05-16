package Alert;

import javafx.scene.control.Alert;

public class ErrorAlert {
    public static void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText(message);
        alert.show();
    }
}
