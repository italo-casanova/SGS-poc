package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Supplier {
    private int supplierId;
    private String supplierCode;
    private String supplierName;
    private String supplierEmail;
    private int supplierPhone;
    private int supplierRuc;
}
