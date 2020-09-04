/* lisa disalvo
2020-13-07
 */

abstract class Product
{

    //Product Number
    public int productNumber;
    public String productName;
    public double purchasePrice;

    // the Product class has one constructor
    public Product(int number, double cost, String name)
    {
        this.productNumber = number;
        this.purchasePrice = cost;
        this.productName = name;
    }

    public String getName()
    {
        return this.productName;
    }

    public int getNumber()
    {
        return this.productNumber;
    }

    public double getPrice()
    {
        return this.purchasePrice;
    }

    public void setPrice(double price)
    {
        this.purchasePrice = price;
    }

    public void setNumber(int number)
    {
        this.productNumber = number;
    }

    public void setName(String name)
    {
        this.productName = name;
    }


    // compares phone
    public abstract int compareTo(Cellphone that);

    // toString() method to print info of Product
    public String toString()
    {
        return("This product is called: " + this.getName()
                +" This product's number is: " + this.getNumber()
                + " The price of this product is: "+ this.getPrice());
    }


}
