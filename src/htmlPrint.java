
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class htmlPrint {
    public static void generateHtmlFile(JTable table, String fileName, Double subTotal, Double tax, Double total) {
        TableModel model = table.getModel();
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("<html><head><title>Ticket</title>");
            writer.write("<style>");
            writer.write("body { font-family: Arial, sans-serif; margin: 10px; }");
            writer.write("table { width: auto; border-collapse: collapse; margin-left: 20px; }");
            writer.write("th, td { border: 1px solid #333; padding: 5px; text-align: left; }");
            writer.write("th { font-weight: bold; }");
            writer.write("tr:nth-child(even) { background-color: #f2f2f2; }");
            writer.write("td.subtotal { font-weight: bold; }");

            
            writer.write("td.currency:before { content: '$'; }");

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
                    if (column == 2) { // Aplicar estilo currency (símbolo $) a la columna Amount
                        writer.write("<td class='currency'>" + model.getValueAt(row, column) + "</td>");
                    } else {
                        writer.write("<td>" + model.getValueAt(row, column) + "</td>");
                    }
                }
                writer.write("</tr>");
            }
            writer.write("</table>");

            
            writer.write("<div style='height: 20px;'></div>");

           
            writer.write("<table border='1'>");
            writer.write("<tr>");
            writer.write("<td colspan='" + (columnCount - 1) + "' class='subtotal'>Subtotal:</td>");
            writer.write("<td class='subtotal currency'>" + subTotal + "</td>");
            writer.write("</tr>");

            writer.write("<tr>");
            writer.write("<td colspan='" + (columnCount - 1) + "' class='subtotal'>Tax:</td>");
            writer.write("<td class='subtotal currency'>" + tax + "</td>");
            writer.write("</tr>");

            writer.write("<tr>");
            writer.write("<td colspan='" + (columnCount - 1) + "' class='subtotal'>Total:</td>");
            writer.write("<td class='subtotal currency'>" + total + "</td>");
            writer.write("</tr>");
            writer.write("</table>");

            writer.write("</body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}