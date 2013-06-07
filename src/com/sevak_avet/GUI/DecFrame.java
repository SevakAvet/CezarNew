package com.sevak_avet.GUI;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DecFrame extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		AbstractFrame.init(stage, FRAME.BUTTON_DECRYPT.getText());
		AbstractFrame.getScene().setOnKeyReleased(AbstractFrame.decryptKey);
		
		Button btn = AbstractFrame.getBtn();
		btn.setOnMouseClicked(AbstractFrame.decryptHandler);

		stage.setTitle(FRAME.VERSION_DECRYPT.getText());
		stage.setResizable(false);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
