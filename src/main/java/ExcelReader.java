import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static void main(String[] args) {
        String excelPath = "/Users/sammacbook/Desktop/Project-Management-Sample-Data.xlsx";

        try (FileInputStream fis = new FileInputStream(excelPath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            // Loop through each sheet
            for (Sheet sheet : workbook) {
                System.out.println("Sheet: " + sheet.getSheetName());

                // Loop through each row
                for (Row row : sheet) {
                    // Loop through each cell
                    for (Cell cell : row) {
                        switch (cell.getCellType()) {
                            case STRING:
                                System.out.print(cell.getStringCellValue() + "\t");
                                break;
                            case NUMERIC:
                                System.out.print(cell.getNumericCellValue() + "\t");
                                break;
                            case BOOLEAN:
                                System.out.print(cell.getBooleanCellValue() + "\t");
                                break;
                            case FORMULA:
                                System.out.print(cell.getCellFormula() + "\t");
                                break;
                            default:
                                System.out.print(" \t");
                        }
                    }
                    System.out.println(); // new line per row
                }
                System.out.println("------------------------------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
