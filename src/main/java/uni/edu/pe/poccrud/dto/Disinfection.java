package uni.edu.pe.poccrud.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@Data
@AllArgsConstructor
public class Disinfection {
    private int disinfectionID, disinfectionDoses, disinfectAmount, insecticideAmount, insecticideDoses;
    private Date disinfectionDate;
    private String disinfectionCode, insecticideBrand, disinfectantBrand;
}
