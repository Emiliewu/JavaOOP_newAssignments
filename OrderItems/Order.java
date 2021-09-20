import java.util.ArrayList;

public class Order {
  
  private String name;
  private double total;
  private boolean ready;
  private ArrayList<Item> items = new ArrayList<Item>();

  public Order(){
    this.name = "guest";
  }

  public Order(String name, boolean ready, ArrayList<Item> items) {
    this.name = name;
    this.ready = ready;
    this.items = items;
    for(Item i: items) {
      this.total += i.getPrice();
    }
  }

  public String getName(){
    return this.name;
  }
  public double getTotal(){
    return this.total;
  }
  public boolean getReady(){
    return this.ready;
  }
  public ArrayList<Item> getItems(){
    return this.items;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setTotal(ArrayList<Item> items){
    for(Item i: items) {
      this.total += i.getPrice();
    }
  }
  public void setReady(boolean ready){
    this.ready = ready;
  }
  public void setItems(ArrayList<Item> items){
    this.items = items;
  }
}