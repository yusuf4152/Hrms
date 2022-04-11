package coding.hrms.entity.Concretes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jobexperience")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class JobExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "companyname")
    private String companyName;

    @Column(name = "position")
    private String position;

    @Column(name = "begintime")
    private LocalDate beginTime;

    @Column(name = "endtime")
    private LocalDate endTime;

    @ManyToOne
    @JoinColumn(name = "jobseekerid")
    private JobSeeker jobSeeker;

}
