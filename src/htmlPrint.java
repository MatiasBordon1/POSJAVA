/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;
/**
 *
 * @author bores
 */
public class htmlPrint {
    public static void generateHtmlFile(JTable table, String fileName) {
        TableModel model = table.getModel();
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("<html><head><title>Table Data</title></head><body><table border='1'>");

           
            writer.write("<tr>");
            for (int i = 0; i < columnCount; i++) {
                writer.write("<th>" + model.getColumnName(i) + "</th>");
            }
            writer.write("</tr>");

           
            for (int row = 0; row < rowCount; row++) {
                writer.write("<tr>");
                for (int column = 0; column < columnCount; column++) {
                    writer.write("<td>" + model.getValueAt(row, column) + "</td>");
                }
                writer.write("</tr>");
            }

            writer.write("</table></body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
