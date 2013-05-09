package com.sevak_avet.GUI;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EncFrame extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		AbstractFrame.init(stage, FRAME.BUTTON_ENCRYPT.getText());
		Button btn = AbstractFrame.getBtn();
		btn.setOnMouseClicked(AbstractFrame.encryptHandler);

		stage.setTitle(FRAME.VERSION_ENCRYPT.getText());
		stage.setResizable(false);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
