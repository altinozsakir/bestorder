package bestorder.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bestorder.Dao.OrderDao;
import bestorder.Entity.Order;

import java.util.Collection;

/**
 * Created by altinoz on 7/25/17.
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public Collection<Order> getAllOrder(){
        return this.orderDao.getAllOrder();
    }

    public Order getOrderById(int id){
        return this.orderDao.getOrderById(id);
    }

    public void removeOrderById(int id){
        this.orderDao.removeOrderById(id);
    }

    public void updateOrder(Order order){
        this.orderDao.updateOrder(order);
    }

}

