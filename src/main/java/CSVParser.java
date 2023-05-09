import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class CSVParser
{
    public void parse()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try
        {
            CSVReader reader = new CSVReaderBuilder(new FileReader("C:\\Users\\Piotr\\Desktop\\project_data.csv")).
                    withSkipLines(1).
                            build();
        List<Object> csv_objectList = reader.readAll().stream().map(data->
        {
            Purchase csvObject = new Purchase();
            csvObject.setId(data[0]);
            csvObject.setPerson(csvObject.new Person() {{
                setName(data[1]);
                setSurname(data[2]);
                setEmail(data[3]);
                setIp(data[4]);
            }});
            csvObject.setCar(csvObject.new Car() {{
                setColor(data[5]);
                setVin(data[5]);
                setCompany(data[6]);
                setModel(data[8]);
                setModel_year(data[9]);
                setPrice(data[10]);
            }});
            csvObject.setLocalization(csvObject.new Localization() {{
                setCountry(data[11]);
                setCity(data[12]);
            }});
//            csvObject.setDateTime(LocalDateTime.parse(data[13], formatter));
            return csvObject;



        }).collect(Collectors.toList());
        csv_objectList.forEach(System.out::println);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
