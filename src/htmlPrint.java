import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class htmlPrint {
    public static void generateHtmlFile(JTable table, String fileName, Double subTotal, Double tax, Double total, String payment, Double display, Double change, int numeroMesa, String fechaHoraActual ) {
        TableModel model = table.getModel();
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("<html><head><title>Ticket</title>");
            writer.write("<style>");
            writer.write("body { font-family: Arial, sans-serif; margin: 10px; display: flex; flex-direction: column; align-items: center; }"); // Centra el contenido horizontalmente
            writer.write(".table-container { margin: 0 20px; }"); // Agrega márgenes a las tablas individuales
            writer.write("table { width: auto; border-collapse: collapse; margin-bottom: 20px; }");
            writer.write("th, td { border: 1px solid #333; padding: 5px; text-align: left; }");
            writer.write("th { font-weight: bold; }");
            writer.write("tr:nth-child(even) { background-color: #f2f2f2; }");
            writer.write("td.subtotal { font-weight: bold; }");
            writer.write("td.currency:before { content: '$'; }");
            writer.write("</style></head><body>");
            
            
            
            writer.write("<div class='table-container'>");
            writer.write("<p>Mesa: " + numeroMesa + "</p>");
            writer.write("<p>Fecha y hora de impresión: " + fechaHoraActual + "</p>");
            writer.write("</div>");


            // Primera tabla (Productos)
            writer.write("<div class='table-container'>");
            writer.write("<table border='1'>");
            writer.write("<tr>");
            for (int i = 0; i < columnCount; i++) {
                writer.write("<th>" + model.getColumnName(i) + "</th>");
            }
            writer.write("</tr>");
            for (int row = 0; row < rowCount; row++) {
                writer.write("<tr>");
                for (int column = 0; column < columnCount; column++) {
                    if (column == 2) {
                        writer.write("<td class='currency'>" + model.getValueAt(row, column) + "</td>");
                    } else {
                        writer.write("<td>" + model.getValueAt(row, column) + "</td>");
                    }
                }
                writer.write("</tr>");
            }
            writer.write("</table>");
            writer.write("</div>");

            // Segunda tabla (Subtotal, Tax, Total)
            writer.write("<div class='table-container'>");
            writer.write("<table border='1'>");
            writer.write("<tr>");
            writer.write("<td>Subtotal:</td>");
            writer.write("<td class='currency'>" + subTotal + "</td>");
            writer.write("</tr>");
            writer.write("<tr>");
            writer.write("<td>Tax:</td>");
            writer.write("<td class='currency'>" + tax + "</td>");
            writer.write("</tr>");
            writer.write("<tr>");
            writer.write("<td>Total:</td>");
            writer.write("<td class='currency'>" + total + "</td>");
            writer.write("</tr>");
            writer.write("</table>");
            writer.write("</div>");

            // Tercera tabla (Payment, Display, Change)
            writer.write("<div class='table-container'>");
            writer.write("<table border='1'>");
            writer.write("<tr>");
            writer.write("<td>Payment Method:</td>");
            writer.write("<td>" + payment + "</td>");
            writer.write("</tr>");
            writer.write("<tr>");
            writer.write("<td>Amount Received:</td>");
            writer.write("<td class='currency'>" + display + "</td>");
            writer.write("</tr>");
            writer.write("<tr>");
            writer.write("<td>Change:</td>");
            writer.write("<td class='currency'>" + change + "</td>");
            writer.write("</tr>");
            writer.write("</table>");
            writer.write("</div>");

            writer.write("</body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}