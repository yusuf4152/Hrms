package coding.hrms.entity.Dtos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementWithEmployerAndPositionDto {
    private String companyName;
    private String jobTitle;
    private int numberOfAvailablePositions;
    private LocalDate lastApplicationDate;
    private LocalDate releaseDate;
}
