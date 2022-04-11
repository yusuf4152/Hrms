package coding.hrms.entity.Concretes;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jobseekers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","schools","jobExperiences","resumeProperties","foreignLanguages"})
public class JobSeeker extends User{

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nationalityid")
    private String nationalityId;

    @Column(name = "birthyear")
    private int birthYear;

    @OneToMany(mappedBy = "jobSeeker")
    private List<School> schools;

    @OneToMany(mappedBy = "jobSeeker")
    private List<JobExperience> jobExperiences;

    @OneToMany(mappedBy = "jobSeeker")
    private List<ResumeProperties> resumeProperties;

    @OneToMany(mappedBy = "jobSeeker")
    private List<ForeignLanguage> foreignLanguages;
}














