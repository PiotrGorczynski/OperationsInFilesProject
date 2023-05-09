import java.math.BigDecimal;
import java.time.LocalDateTime;



public class Purchase
{
        String id;
        Person person;
        Car car;
        Localization localization;
        LocalDateTime dateTime;

        public String getId()
        {
            return id;
        }

        public Person getPerson()
        {
            return person;
        }

        public Car getCar()
        {
            return car;
        }

        public Localization getLocalization()
        {
            return localization;
        }

        public LocalDateTime getDateTime()
        {
            return dateTime;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public void setPerson(Person person)
        {
            this.person = person;
        }

        public void setCar(Car car)
        {
            this.car = car;
        }

        public void setLocalization(Localization localization)
        {
            this.localization = localization;
        }

        public void setDateTime(LocalDateTime dateTime)
        {
            this.dateTime = dateTime;
        }

    @Override
    public String toString()
    {
        return "Purchase{" +
                "id='" + id + '\'' +
                ", person=" + person +
                ", car=" + car +
                ", localization=" + localization +
                ", dateTime=" + dateTime +
                '}';
    }

    public class Person {
        String name = "";
        String surname;
        String email;
        String ip;

        public String getName()
        {
            return name;
        }

        public String getSurname()
        {
            return surname;
        }

        public String getEmail()
        {
            return email;
        }

        public String getIp()
        {
            return ip;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public void setSurname(String surname)
        {
            this.surname = surname;
        }

        public void setEmail(String email)
        {
            this.email = email;
        }

        public void setIp(String ip)
        {
            this.ip = ip;
        }

        @Override
        public String toString()
        {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", email='" + email + '\'' +
                    ", ip='" + ip + '\'' +
                    '}';
        }
    }

    public class Localization
    {
        String country;
        String city;

        public String getCountry()
        {
            return country;
        }

        public void setCountry(String country)
        {
            this.country = country;
        }

        public String getCity()
        {
            return city;
        }

        public void setCity(String city)
        {
            this.city = city;
        }

        @Override
        public String toString()
        {
            return "Localization{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }

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

        @Override
        public String toString()
        {
            return "Car{" +
                    "color='" + color + '\'' +
                    ", vin='" + vin + '\'' +
                    ", company='" + company + '\'' +
                    ", model='" + model + '\'' +
                    ", model_year='" + model_year + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
