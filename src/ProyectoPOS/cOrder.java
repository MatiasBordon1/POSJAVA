package ProyectoPOS;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="Mesas")
public class cOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="Total")
    private double total;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date date;
    @Column(name = "Mesa")
     private int mesa;
//    @ManyToMany
//    @JoinTable()
//    private List<Item> items;
    
    
    public cOrder(){
    
    }

    public cOrder(int id, double total, Date date, int mesa) {
        this.id = id;
        this.total = total;
        this.date = date;
        this.mesa = mesa;
        
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    
    
    
    
}

