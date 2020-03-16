package szakdolgozat.rate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RateDTO {

    private Long id;

    private Long orderid;

    private Long bookid;

    private Float rate;

}
