package bestorder.Dao;

import org.springframework.stereotype.Repository;

import bestorder.Entity.Order;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by altinoz on 7/25/17.
 */
@Repository
public class OrderDao {

    private static Map<Integer,Order> orderMap;

    static {
        orderMap = new HashMap<Integer, Order>(){
            {
                put(1,new Order(1,"Patates"));
                put(2,new Order(2,"Elma"));
                put(3,new Order(3,"Portakal"));
            }
        };
    }

    public Collection<Order> getAllOrder(){
        return this.orderMap.values();
    }

    public Order getOrderById(int id){
        return this.orderMap.get(id);
    }

    public void removeOrderById(int id){
        this.orderMap.remove(id);
    }

    public void updateOrder(Order order){
        Order o = new Order();
        o.setId(order.getId());
        o.setName(order.getName());
        this.orderMap.put(order.getId(),o);

    }
}

