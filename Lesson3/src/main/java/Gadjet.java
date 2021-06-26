public abstract class Gadjet {

    private String name;
    private double weight;
    private int price;
    private String size;

    abstract void destination();
    abstract void need();
    abstract void count(String i, String w);

    public void clean(){
        System.out.println(toString() + ", может слегкостью очисть зубы.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
