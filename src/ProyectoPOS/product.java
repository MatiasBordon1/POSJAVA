package ProyectoPOS;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="Producto")
@NamedQueries({
    @NamedQuery(name = "product.findAll", query = "SELECT p FROM product p"),
    @NamedQuery(name = "product.findByName", query = "SELECT p FROM product p WHERE p.nombre = :name")
})
public class product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="precio")
    private double precio;
    
    @ManyToMany(mappedBy = "products")
    private List<cOrder> orders;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public String getNombre() {
        return nombre;
    }
     
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public product(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    
     public product() {

    }
    
    
}
