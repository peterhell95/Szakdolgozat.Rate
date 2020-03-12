package szakdolgozat.security.services;

import java.util.List;

import szakdolgozat.security.dto.OrderDTO;

public interface OrderService {
    public List<OrderDTO> getAllOrder();

    public OrderDTO getOneOrder(Long id);

    public OrderDTO createOrder(OrderDTO order);

}