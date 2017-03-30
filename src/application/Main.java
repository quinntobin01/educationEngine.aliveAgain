package application;
	



	

	

import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import quinn.education.model.Model.Item;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
public class Main extends Application {

private ObservableList<Item> itemCollection = FXCollections.observableArrayList();

private Stage primaryStage;
private BorderPane rootLayout;


public Main() {
//salesRecord.add(new Item("Old Carpet", 12.65));
//salesRecord.add(new Item("Dishes", 1.00));
//salesRecord.add(new Item("Golf Club", 5.35));
//itemCollection.add(new Item());
}	
@Override
public void start(Stage primaryStage) {
try {
	try {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,400,400);
		Scene typing = new Scene(root,400,400);
		Scene login = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setScene(typing);
		primaryStage.setScene(login);
		primaryStage.show();
	} catch(Exception e) {
		e.printStackTrace();
	}
this.primaryStage = primaryStage;
this.primaryStage.setTitle("Education Engine"); 
this.primaryStage.getIcons().add(new Image("file:resources/images/AppIcon.png"));

initRootLayout();

showItemsOverview();

} catch(Exception e) {

e.printStackTrace();
}
}

	

public static void main(String[] args) {
launch(args);
}
public void initRootLayout() {
try {

FXMLLoader loader = new FXMLLoader();

loader.setLocation(Main.class.getResource("/quinn/education/view/RootLayout.FXML"));

rootLayout = (BorderPane) loader.load();

Scene scene = new Scene(rootLayout);

primaryStage.setScene(scene);

primaryStage.show();
} catch (IOException e) {
e.printStackTrace();
}
}


public void showItemsOverview() {
try {

FXMLLoader loader = new FXMLLoader();

loader.setLocation(Main.class.getResource("/quinn/education/view/Item Overview.FXMl"));

AnchorPane itemOverview = (AnchorPane) loader.load();

rootLayout.setCenter(itemOverview);


quinn.education.view.Veiw.ItemOverviewController controller = loader.getController();

controller.setmainApp(this);
 
} catch (IOException e) {
e.printStackTrace();
}
}
public void typing(){
	try{
		FXMLLoader loader = new FXMLLoader();
		
		loader.setLocation(Main.class.getResource(""));
		
		AnchorPane typing = (AnchorPane) loader.load();
		
		
		quinn.education.view.View.typingController = loader.getController();
		
		controller.setmainApp(this);
		
	}catch(IOExcpetion e){
		e.printStackTrace();
	}
		}
public void login(){
	FXMLLoader loader = new FXMLLoader();
	
	loader.setLocation(Main.class.getResource(""));
	
	AnchorPane login = (AnchorPane) loader.load();
	
	quinn.education.view.View.loginController = loader.getController();

}catch(IOExcpetion e){
	 e.printStackTrace();
}
}
	
public Stage getPrimaryStage() {
return primaryStage;
}



public ObservableList<Item> setSalesRecord() {
	
	return null;
}
public ObservableList<Item> getItemCollection() {
	return itemCollection;
}
public void setItemCollection(ObservableList<Item> itemCollection) {
	this.itemCollection = itemCollection;
}

}


