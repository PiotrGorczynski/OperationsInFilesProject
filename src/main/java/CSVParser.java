import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class CSVParser
{
    public void parse()
    {
        try
        {
            CSVReader reader = new CSVReaderBuilder(new FileReader("C:\\Users\\Piotr\\Desktop\\project_data.csv")).
                    withSkipLines(1).
                            build();
        List<Object> csv_objectList = reader.readAll().stream().map(data->
        {
            Purchase csvObject = new Purchase();
            csvObject.setId(data[0]);
            csvObject.person.setName(data[1]);
            csvObject.person.setSurname(data[2]);
            csvObject.person.setEmail(data[3]);
            csvObject.person.setIp(data[4]);
            csvObject.car.setColor(data[5]);
            csvObject.car.setVin(data[6]);
            csvObject.car.setCompany(data[7]);
            csvObject.car.setModel(data[8]);
            csvObject.car.setModel_year(data[9]);
            csvObject.car.setPrice(data[10]);
            csvObject.localization.setCountry(data[11]);
            csvObject.localization.setCity(data[12]);
            csvObject.setDateTime(LocalDateTime.parse(data[13]));
            return csvObject;



        }).collect(Collectors.toList());
        csv_objectList.forEach(System.out::println);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
