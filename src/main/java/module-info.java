/*
 * module-info.java
 *
 */
module com.maehem.example {
    requires javafx.graphics;
    requires javafx.controls;
    requires com.almasb.fxgl.all;
    requires com.almasb.fxgl.controllerinput;

    // in our JavaFX only version we had to export this:
    //exports com.maehem.example to javafx.graphics;
    // But in FXGL, we need to export this:
    exports com.maehem.example to com.almasb.fxgl.core;
}
