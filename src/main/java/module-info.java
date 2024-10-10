module bakutina.anketaapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens bakutina.anketa_app to javafx.fxml;
    exports bakutina.anketa_app;
}