package hbm;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by yanliwei on 2017/7/31.
 */
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderid;
    private Double orderprice;
    private Timestamp ordertime;

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public Double getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Double orderprice) {
        this.orderprice = orderprice;
    }

    public Timestamp getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderid != order.orderid) return false;
        if (orderprice != null ? !orderprice.equals(order.orderprice) : order.orderprice != null) return false;
        if (ordertime != null ? !ordertime.equals(order.ordertime) : order.ordertime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderid;
        result = 31 * result + (orderprice != null ? orderprice.hashCode() : 0);
        result = 31 * result + (ordertime != null ? ordertime.hashCode() : 0);
        return result;
    }
}
