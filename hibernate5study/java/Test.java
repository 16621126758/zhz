import com.sun.org.apache.xpath.internal.operations.Or;
import hbm.Event;
import hbm.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yanliwei on 2017/7/31.
 */
public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );
        }
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();//开启事务
//        Event event = new Event();
//        event.setDate(new java.util.Date());
//        event.setTitle("今天天气不错，风和日丽！");
        Order order = new Order();
        order.setOrderprice(34523.97);
        order.setOrdertime(new Timestamp(System.currentTimeMillis()));
        session.save(order);//把对象持久化到数据库中，其实就是插入一条记录
//
//        Order order = session.load(Order.class,0);
//        order.setOrderprice(23.098);
//        session.delete(order);
        List list = session.createQuery("from Order").list();
        Iterator<Order> it = list.iterator();
        while(it.hasNext()){
            Order o = it.next();
            System.out.println(o.getOrderprice() + "   "+o.getOrdertime());
        }

        tx.commit();
        session.close();
    }
}
