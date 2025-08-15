package org.prog.session9;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class LocationDto {
    private StreetDto street;
    private String city;

    public String getCity() {
        return city;
    }
}
