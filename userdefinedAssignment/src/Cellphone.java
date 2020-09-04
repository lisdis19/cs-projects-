//derived class
/* lisa disalvo
2020-13-07
 */
class Cellphone extends Product
{
    // the Cellphone subclass adds a few more fields
    public int macNumber;
    public double screenSize;
    public String modelType;


    // the Cellphone subclass has one constructor
    public Cellphone (int number, String name, double price, int phoneId, double phoneSize, String model)
    {
        super(number, price, name);
        this.macNumber = phoneId;
        this.screenSize = phoneSize;
        this.modelType = model;
    }

    public int getMacNumber()
    {
        return this.macNumber;
    }

    public double getScreenSize()
    {
        return this.screenSize;
    }

    public String getModelType()
    {
        return this.modelType;
    }

    public void setScreenSize(Double phoneSize)
    {
        this.screenSize = phoneSize;
    }

    public void setModelType(String model)
    {
        this.modelType = model;
    }

    public void setMacNumber(int phoneId)
    {
        this.macNumber = phoneId;
    }

    // compares phone
    @Override
    public int compareTo(Cellphone that)
    {
        return this.getModelType().compareTo(that.getModelType());
    }

    // sees if models are the same
    public boolean equals(Cellphone that)
    {
        return this.getModelType().equals(that.getModelType());
    }

    // overriding toString() method
    // of Product to print more info
    @Override
    public String toString()
    {
        return("This cellphone's MAC number is : " + getMacNumber() + "\nThe cellphone's screen size is: " + getScreenSize() + "\nThe cellphone's model type is : " + getModelType() + "\nThe cellphone's retail price is: " + getPrice() + "\nThe cellphone's Product number is: " + getNumber() + "\nThe products name/brand is: " + getName());
    }

}
