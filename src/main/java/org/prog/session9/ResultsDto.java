package org.prog.session9;

import lombok.Data;

import java.util.List;

@Data
public class ResultsDto {
    private List<PersonDto> results;

    public List<PersonDto> getResults() {
        return results;
    }

    public void setResults(List<PersonDto> results) {
        this.results = results;
    }
}
