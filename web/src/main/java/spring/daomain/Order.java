package spring.daomain;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/19.9:08
 * ****************************************************
 */
public class Order {
    private String name;
    private int id;
    private float price;

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    public Order(String name, int id, float price) {

        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
