package szakdolgozat.rate.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import szakdolgozat.rate.dto.RateDTO;
import szakdolgozat.rate.model.Rate;

@Mapper
public interface RateMapper {

    public RateDTO rateToRateDTO(Rate source);

    @Mapping(target = "id", ignore = true)
    public Rate rateDTOToRate(RateDTO source);

    @IterableMapping(qualifiedByName = "rateToRateDTO")
    public default List<RateDTO> rateListToRateDTOList(List<Rate> source) {
        return source == null ? new ArrayList<>() : source.stream().map(this::rateToRateDTO).collect(Collectors.toList());
    }

    public Rate rateDTOToRateUpdate(RateDTO source);
}
