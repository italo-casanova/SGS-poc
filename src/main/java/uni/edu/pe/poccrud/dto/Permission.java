package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Permission {
    private int permissionId;
    private String permissionCode, permissionMotive;
    private Date permissionDate;
}
