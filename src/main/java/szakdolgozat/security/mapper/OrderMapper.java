package szakdolgozat.security.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import szakdolgozat.security.dto.OrderDTO;
import szakdolgozat.security.model.Order;

@Mapper
public interface OrderMapper {

    public OrderDTO orderToOrderDTO(Order source);

    @Mapping(target = "id", ignore = true)
    public Order orderDTOToOrder(OrderDTO source);

    @IterableMapping(qualifiedByName = "orderToOrderDTO")
    public default List<OrderDTO> orderListToOrderDTOList(List<Order> source) {
        return source == null ? new ArrayList<>() : source.stream().map(this::orderToOrderDTO).collect(Collectors.toList());
    }

    public Order orderDTOToOrderUpdate(OrderDTO source);
}
