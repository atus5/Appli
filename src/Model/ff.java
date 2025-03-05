package Model;

 
public class ff {
    private int id;
    private String category;
    private String food;

    public int getId() {
        return id; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }
 
    public void setCategory(String category) {
        this.category = category;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    private float price;

    
    public ff(int id, String category, String food, float price) {
        this.id = id;
        this.category = category;
        this.food = food;
        this.price = price;
    }

    public ff() {
    }
}
