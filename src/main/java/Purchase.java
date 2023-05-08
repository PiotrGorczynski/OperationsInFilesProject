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


}
