package utils;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;

public class CSVReaderUtil {

    public static Object[][] getCSVData(String filePath) {

        List<Object[]> data = new ArrayList<>();

        try {
            CSVReader reader = new CSVReader(new FileReader(filePath));
            String[] line;

            reader.readNext(); // skip header row

            while ((line = reader.readNext()) != null) {
                data.add(new Object[]{line[0], line[1]});
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data.toArray(new Object[0][]);
    }
}