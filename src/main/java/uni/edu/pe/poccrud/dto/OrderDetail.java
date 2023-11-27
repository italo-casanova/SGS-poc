package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDetail {
    private int toolTypeId, orderId, toolQuantity;
    private String orderDetailCode, limitTime;
}
