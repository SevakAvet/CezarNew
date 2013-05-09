package com.sevak_avet.GUI;

import com.sevak_avet.Cryption.DecryptionCezar;
import com.sevak_avet.Cryption.EncryptCezar;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AbstractFrame extends Application {
	private static Scene scene;
	private static Group root;

	private static TextArea textAreaInput;
	private static TextArea textAreaOutput;
	private static Button btn;
	private static Button clearAll;

	private static int width = FRAME.WIDTH.getSize();
	private static int height = FRAME.HEIGHT.getSize();

	public static void init(Stage stage, String encOrDec) throws Exception {
		root = new Group();
		scene = new Scene(root, width, height);

		textAreaInput = new TextArea();
		textAreaInput.setLayoutX(10);
		textAreaInput.setLayoutY(10);
		textAreaInput.setMaxHeight(70);
		textAreaInput.setMaxWidth(298);
		root.getChildren().add(textAreaInput);

		btn = new Button(encOrDec);
		btn.setLayoutX(320);
		btn.setLayoutY(20);
		root.getChildren().add(btn);

		clearAll = new Button("Clear all");
		clearAll.setLayoutX(320);
		clearAll.setLayoutY(50);
		clearAll.setOnMouseClicked(clearAllHandler);
		root.getChildren().add(clearAll);

		textAreaOutput = new TextArea();
		textAreaOutput.setLayoutX(10);
		textAreaOutput.setLayoutY(90);
		textAreaOutput.setMinHeight(200);
		textAreaOutput.setMaxWidth(380);
		textAreaOutput.setEditable(false);
		root.getChildren().add(textAreaOutput);
		
		stage.setScene(scene);
	}

	public static EventHandler<MouseEvent> encryptHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			EncryptCezar enc = new EncryptCezar(textAreaInput.getText(), 7);
			textAreaOutput.setText(enc.getEncText());
		}
	};

	public static EventHandler<MouseEvent> decryptHandler = new EventHandler<MouseEvent>(){
		@Override
		public void handle(MouseEvent e) {
			DecryptionCezar dec = new DecryptionCezar(textAreaInput.getText(), 7);
			textAreaOutput.setText(dec.getDecText());
		}
	};
	
	private static EventHandler<MouseEvent> clearAllHandler = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent arg0) {
			textAreaInput.setText("");
			textAreaOutput.setText("");			
		}
	};
	
	public static Button getBtn(){
		return btn;
	}
	

	@Override
	public void start(Stage arg0) throws Exception {

	}

}
