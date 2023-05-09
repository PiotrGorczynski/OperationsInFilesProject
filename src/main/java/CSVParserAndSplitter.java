import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CSVParserAndSplitter
{
    public static void main(String[] args) throws IOException
    {
        CSVParserAndSplitter.splitToSeveralFiles();

    }

    public static void splitToSeveralFiles() throws IOException
    {
        CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Piotr\\Desktop\\client-car-purchase-spreadsheet.csv"));
        String[] headers = reader.readNext();
        Map<String, List<String[]>> dict = new HashMap<>();
        int colIndex = Arrays.asList(headers).indexOf("car_model");
        String[] row;

        while ((row = reader.readNext()) != null) {
            String key = row[colIndex];
            if (!dict.containsKey(key)) {
                dict.put(key, new ArrayList<>());
            }
            dict.get(key).add(row);
        }

        for (String key : dict.keySet()) {
            CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\Piotr\\Desktop\\folderToStoreCSVCars" + key + ".csv"));
            writer.writeNext(headers);
            for (String[] array : dict.get(key)) {
                writer.writeNext(array);
            }
            writer.close();
        }

    }
}
