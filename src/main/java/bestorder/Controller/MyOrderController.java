package bestorder.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bestorder.Entity.Order;
import bestorder.Service.OrderService;


@RestController(value = "/orders")
public class MyOrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/orders",method = RequestMethod.GET)
    public Collection<Order> getAllOrder(){
        return this.orderService.getAllOrder();
    }

    @RequestMapping(value = "/orders/{id}",method = RequestMethod.GET)
    public Order getOrderById(@PathVariable int id){
        return this.orderService.getOrderById(id);
    }

    @RequestMapping(value = "/orders/{id}",method = RequestMethod.DELETE)
    public void removeOrderById(@PathVariable int id){
        this.orderService.removeOrderById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateOrder(@RequestBody Order order){
        this.orderService.updateOrder(order);
    }
}
