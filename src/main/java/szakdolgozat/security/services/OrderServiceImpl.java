package szakdolgozat.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.Getter;
import lombok.Setter;
import szakdolgozat.security.dto.OrderDTO;
import szakdolgozat.security.mapper.OrderMapper;
import szakdolgozat.security.model.Order;
import szakdolgozat.security.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    @Getter
    @Setter
    private OrderRepository repository;

    @Autowired
    private OrderMapper orderMapper;

    public List<OrderDTO> getAllOrder() {
        return orderMapper.orderListToOrderDTOList(repository.findAll());
    }

    public OrderDTO getOneOrder(Long id) {
        return orderMapper.orderToOrderDTO(repository.findById(id).get());
    }

    public OrderDTO createOrder(OrderDTO order) {
        Order entity = orderMapper.orderDTOToOrder(order);
        return orderMapper.orderToOrderDTO(repository.save(entity));
    }

}