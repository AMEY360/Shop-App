package cart;

public class Item
{
    private int id;
    private String name;
    private String imagePath;
    private String description;
    private double price;

    public Item()
    {
    }
    public Item(final int id,final String name,final String imagePath,final String description,final double price,final int quantity)
    {
        this.id=id;
        this.name=name;
        this.imagePath=imagePath;
        this.description=description;
        this.price=price;
    }
    public void setId(final int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(final String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setImagePath(final String imagePath)
    {
        this.imagePath = imagePath;
    }
    public String getImagePath()
    {
        return imagePath;
    }
    public void setDescription(final String description)
    {
        this.description=description;
    }
    public String getDescription()
    {
        return description;
    }
    public void setPrice(final double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }
    public boolean equals(Object o)
    {
        return(((Item)o).id==id);
    }
}