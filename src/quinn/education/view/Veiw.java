package quinn.education.view;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import application.Main;
import quinn.education.model.Model.Item;
public class Veiw {
	
	public class ItemOverviewController {
	//generic methods.
	@FXML
	private TableView<Item> itemTable;
	@FXML
	private TableColumn<Item, Integer> quantityColumn;
	@FXML
	private TableColumn<Item, String> nameColumn;
	// Reference to Main Application.
	 Main mainApp;
	//Constructor that is empty
	public ItemOverviewController() {
	}
	@FXML
	private void initialize(){
	
	nameColumn.setCellValueFactory(cellData-> cellData.getValue().itemNameProperty());
	quantityColumn.setCellValueFactory(cellData->
	cellData.getValue().quantitySoldProperty().asObject());
	}
	// @param mainApp
	public void setmainApp(Main mainApp) {

	//This sets the field for this controller to the application passed in:
	//This allows the main application to have a pointer to itself by setting its own pointer into the controller's field
	this.mainApp = mainApp;
	
	//This is the observable collection of Items
	 itemTable.setItems(( mainApp).getItemCollection());
	}
	}
}