package uni.edu.pe.poccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PackageType {
    private int packagetypeId;
    private String packagetypeCode,packagetypeName;
}

