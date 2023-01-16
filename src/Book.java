public class Book {
    String name;
    double price;
    int qty;
    public Author bookAuthor;
    public Book(String name,Author bookAuthor, double price, int qty){
        this.name = name;
        this.bookAuthor = bookAuthor;
        this.price = price;
        this.qty = qty;
    }

    //getters
    public String getName(){ return name;}
    public double getPrice(){ return price;}
    public int getQty(){return qty;}

    //setters
    public void setName(String name){this.name = name;}
    public void setPrice(double price){this.price = price;}
    public void setQty(int qty){this.qty = qty;}

    public String toString(){
        return ("Book name: " + name +  bookAuthor + "Price " + price + ", quantities available " + qty);
    }

}
