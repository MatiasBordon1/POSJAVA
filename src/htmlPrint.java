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
            writer.write("<html><head><title>Table Data</title>");
            writer.write("<style>");
            writer.write("body { font-family: Arial, sans-serif; margin: 10px; }");
            writer.write("table { width: 100%; border-collapse: collapse; }");
            writer.write("th, td { border: 1px solid #333; padding: 5px; text-align: left; }");
            writer.write("tr:nth-child(even) { background-color: #f2f2f2; }");
            writer.write("</style></head><body>");
            writer.write("<table border='1'>");

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
