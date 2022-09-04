package com.maehem.example;

/*-
 * Example of FXGL on RaspberryPi in embedded mode with DRM (Direct Rendering).
 * 
 * Licensed under the MIT License
 *
 */

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import javafx.scene.text.Text;

/**
 * Shows how to use JavaFX UI within FXGL.
 */
public class FXGLExample extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) { }

    @Override
    protected void initUI() {
        Text uiText = new Text("Hello FXGL World");

        FXGL.addUINode(uiText, 300, 300);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
