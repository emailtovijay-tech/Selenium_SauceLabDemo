package Utils;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtil {

    public static Object[][] getLoginData() {

        try {
            FileInputStream fis = new FileInputStream("src/resources/LoginFile.xlsx");
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0);

            int rowCount = sheet.getLastRowNum(); // exclude header
            Object[][] data = new Object[rowCount][2];

            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i <= rowCount; i++) {

                Row row = sheet.getRow(i);

                String username = "";
                String password = "";

                if (row != null) {
                    Cell userCell = row.getCell(0);
                    Cell passCell = row.getCell(1);

                    if (userCell != null && passCell != null)
                    {
                        username = formatter.formatCellValue(userCell);
                        password = formatter.formatCellValue(passCell);
                    }
                }
                if (username.trim().isEmpty() && password.trim().isEmpty()) {
                    continue;
                }

                data[i - 1][0] = username;
                data[i - 1][1] = password;

                System.out.println("Username: " + username + " | Password: " + password);
            }

            // ✅ CLOSE AFTER LOOP
            workbook.close();
            fis.close();

            // ✅ RETURN AFTER LOOP
            return data;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}