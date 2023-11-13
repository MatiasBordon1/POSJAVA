
package ProyectoPOS;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class cPrograma {
    public static void main(String args[]) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("POSPU"); 
    EntityManager em = emf.createEntityManager();

       product[] productos = new product[] {
            new product(1, "Water", 4.00),
            new product(2, "Coke", 3.50),
            new product(3, "Diet Coke", 3.50),
            new product(4, "Fanta", 3.50),
            new product(5, "Sprite", 3.50),
            new product(6, "Lemonade", 3.50),
            new product(7, "Fries", 5.00),
            new product(8, "Beacon Cheese Fries", 6.50),
            new product(9, "Onion Rings", 6.00),
            new product(10, "Muzzarella Sticks", 6.00),
            new product(11, "Nuggets", 6.50),
            new product(12, "Cheese Burger", 7.00),
            new product(13, "Double Cheese Burger", 9.50),
            new product(14, "Fried Chicken Sandwich", 9.00),
            new product(15, "Pizza", 15.00),
            new product(16, "Ice Cream", 10.00),
            new product(17, "Milk Shakes", 12.75),
            new product(18, "Cookies", 4.50),
       };
       
       
        
        for (product producto : productos) {
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
        
        }
em.close();
   
    
            JavaSections javaSections = new JavaSections(emf); 
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaSections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaSections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaSections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaSections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaSections(emf).setVisible(true);
            }
        });
    }
}
