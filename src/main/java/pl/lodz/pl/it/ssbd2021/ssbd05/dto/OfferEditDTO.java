package pl.lodz.pl.it.ssbd2021.ssbd05.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OfferEditDTO extends AbstractDTO {

    @NotBlank
    private String title;
    private String description;
    private Timestamp validFrom;
    private Timestamp validTo;
    private Collection<OfferAvailabilityDTO> offerAvailabilities;

    public OfferEditDTO(long id, Long version, String title, String description, Timestamp validFrom, Timestamp validTo) {
        super(id, version);
        this.title = title;
        this.description = description;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }
}