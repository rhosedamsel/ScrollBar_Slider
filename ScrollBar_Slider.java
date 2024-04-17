import javafx.application.Application;

import javafx.stage.Stage;

import javafx.scene.Scene;

import javafx.scene.control.Label;

import javafx.scene.text.Text;

import javafx.scene.control.Slider;

import javafx.scene.paint.Color;

import javafx.scene.layout.BorderPane;

import javafx.scene.layout.StackPane;

import javafx.scene.layout.GridPane;

import javafx.geometry.Pos;

import javafx.geometry.Insets;

public class ScrollBar_Slider extends Application

{

protected Text textObj = new Text("Show Colors");

protected Slider redSlider = new Slider();

protected Slider greenSlider = new Slider();

protected Slider blueSlider = new Slider();

protected Slider opacitySlider = new Slider();

@Override // Override the start method

public void start(Stage primaryStage)

{

// Create a stack pane for text

StackPane textPaneObj = new StackPane(textObj);

textPaneObj.setPadding(new Insets(20, 10, 5, 10));

// Set slider properties

redSlider.setMin(0.0);

redSlider.setMax(1.0);

greenSlider.setMin(0.0);

greenSlider.setMax(1.0);

blueSlider.setMin(0.0);

blueSlider.setMax(1.0);

opacitySlider.setMin(0.0);

opacitySlider.setMax(1.0);

// Create listeners

redSlider.valueProperty().addListener(ov ->

setColor());

greenSlider.valueProperty().addListener(ov ->

setColor());

blueSlider.valueProperty().addListener(ov ->

setColor());

opacitySlider.valueProperty().addListener(ov ->

setColor());

opacitySlider.setValue(1);

// Create a grid pane for labeled sliders

GridPane slidersPaneObj = new GridPane();

slidersPaneObj.setAlignment(Pos.CENTER);

slidersPaneObj.setVgap(5);

slidersPaneObj.setHgap(5);

slidersPaneObj.add(new Label("Red"), 0, 0);

slidersPaneObj.add(redSlider, 1, 0);

slidersPaneObj.add(new Label("Green"), 0, 1);

slidersPaneObj.add(greenSlider, 1, 1);

slidersPaneObj.add(new Label("Blue"), 0, 2);

slidersPaneObj.add(blueSlider, 1, 2);

slidersPaneObj.add(new Label("Opacity"), 0, 3);

slidersPaneObj.add(opacitySlider, 1, 3);

 
// Place nodes in a border pane


BorderPane paneObj = new BorderPane();

paneObj.setTop(textPaneObj);

paneObj.setCenter(slidersPaneObj);

// Create a scene and place it in the stage

Scene sceneObj = new Scene(paneObj, 250, 150);

primaryStage.setTitle("ScrollBar_Slider");

primaryStage.setScene(sceneObj);

primaryStage.show(); // Display the stage

}

// Set the text color

private void setColor()

{

textObj.setFill(new Color(redSlider.getValue(),

greenSlider.getValue(), blueSlider.getValue(),

opacitySlider.getValue()));

}

public static void main(String[] args)

{

Application.launch(args);

}

}