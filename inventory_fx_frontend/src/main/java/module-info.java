module net.mcoto {
	// Requerimientos básicos de JavaFX
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    
    // Para consumir la API REST (según la librería que elijas)
    // Si usas el cliente nativo de Java 11+:
    requires java.net.http;
    
    // Si usas Jackson para JSON:
    requires com.fasterxml.jackson.databind;

    // Tu dependencia común de modelos
   // requires com.inventory.common;

    // 1. Abrir paquetes de vistas a FXML para que pueda inyectar componentes
   // opens com.inventory.javafx.controllers to javafx.fxml;
    
    // 2. Abrir modelos a Jackson para serialización/deserialización
   // opens com.inventory.javafx.models to com.fasterxml.jackson.databind;

    // Exportar el paquete principal para que JavaFX pueda lanzar la aplicación

   // opens net.mcoto to javafx.fxml;
   // exports net.mcoto;
}
