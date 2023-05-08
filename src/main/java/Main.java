import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        readFromAFile("C:/Users/Piotr/Desktop/client-car-purchase-spreadsheet.csv");
        CSVParser csvParser = new CSVParser();
        csvParser.parse();
    }

    public static void readFromAFile(String fileName) throws IOException
    {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        }
    }
}
