package coding.hrms.entity.Dtos;
import coding.hrms.entity.Concretes.ForeignLanguage;
import coding.hrms.entity.Concretes.JobExperience;
import coding.hrms.entity.Concretes.ResumeProperties;
import coding.hrms.entity.Concretes.School;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerResumeDto {
    private int jobSeekerId;
    private String jobSeekerLastName;
    private String jobSeekerName;
    private List<ForeignLanguage> foreignLanguages;
    private List<JobExperience> jobExperiences;
    private List<School> schools;
    private List<ResumeProperties> resumeProperties;
}
