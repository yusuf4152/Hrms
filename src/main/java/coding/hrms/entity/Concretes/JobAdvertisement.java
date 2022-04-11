package coding.hrms.entity.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jobadvertisement")
public class JobAdvertisement {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "jobdescription")
    private String jobDescription;

    @Column(name = "city")
    private String city;

    @Column(name = "stockavailableposition")
    private int numberOfPositions;

    @Column(name = "lastapplicationdate")
    private LocalDate lastApplicationDate;

    @Column(name = "releasedate")
    private LocalDate releaseDate;

    @Column(name = "isactive")
     private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToOne
    @JoinColumn(name = "jobposition_id")
    private JobPosition jobPosition;
}
