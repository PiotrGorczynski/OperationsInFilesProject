import java.math.BigDecimal;

public class Car{
    String color;
    String vin;
    String company;
    String model;
    String model_year;
    BigDecimal price;

    public String getColor()
    {
        return color;
    }

    public String getVin()
    {
        return vin;
    }

    public String getCompany()
    {
        return company;
    }

    public String getModel()
    {
        return model;
    }

    public String getModel_year()
    {
        return model_year;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setVin(String vin)
    {
        this.vin = vin;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setModel_year(String model_year)
    {
        this.model_year = model_year;
    }

    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    public void setPrice(String datum)
    {
        this.price = price;
    }
}