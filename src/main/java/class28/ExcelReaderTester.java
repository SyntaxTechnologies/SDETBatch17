package class28;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {

      List<Map<String,String>> data= ExcelReader.readExcelData("C:\\Users\\Syntax\\IdeaProjects\\JavaSdetBatch17\\Files\\Sales.xlsx");
      System.out.println(data);
    }
}
