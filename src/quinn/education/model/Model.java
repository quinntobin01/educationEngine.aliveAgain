package quinn.education.model;
//Adapter classes 
	import javafx.beans.property.DoubleProperty;
	import javafx.beans.property.IntegerProperty;
	import javafx.beans.property.StringProperty;
	//Grand-children of above adapter classes
	import javafx.beans.property.SimpleDoubleProperty;
	import javafx.beans.property.SimpleIntegerProperty;
	import javafx.beans.property.SimpleStringProperty;
	
public class Model {
	
	
	
	public class Item {

	private final StringProperty itemName;
	private final DoubleProperty salePrice;
	private final IntegerProperty quantitySold;
	// Default constructor 
	public Item() {
	this(null, null);
	}
	// overloaded constructor 
	public Item(String itemName, Double salePrice){

	this.itemName = new SimpleStringProperty(itemName);
	this.salePrice = new SimpleDoubleProperty(salePrice);
	this.quantitySold = new SimpleIntegerProperty();
	}
	//PROPERTY itemName getter
	public String getItemName() {
	return itemName.get(); //Using get() produces the String content
	}
	//PROPERTY itemName setter
	public void setItemName(String itemName){
	this.itemName.set(itemName); //Using set() accepts/puts the String into the property
	}
	//PROPERTY salePrice getter
	public Double getItemPrice() {
	return salePrice.get(); 
	}
	//PROPERTY salePrice setter
	public void setSalePrice(Double salePrice){ 
	this.salePrice.set(salePrice);
	}
	//PROPERTY quantitySold Getter
	public Integer getQuantitySold(){
	return quantitySold.get(); //Using get() produces the Integer content
	}
	//PROPERTY quantitySold Setter
	public void setQuantitySold(Integer quantitySold){
	this.quantitySold.set(quantitySold); //Using set() accepts/puts the	Integer into the property
	}
	public StringProperty itemNameProperty() {
	return itemName;
	}
	public IntegerProperty quantitySoldProperty() {
	return quantitySold;
	}
	public DoubleProperty salePriceQuantity() {
	return salePrice;
	}
	}
}
