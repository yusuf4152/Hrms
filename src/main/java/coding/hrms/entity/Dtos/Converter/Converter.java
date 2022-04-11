package coding.hrms.entity.Dtos.Converter;

import coding.hrms.entity.Concretes.JobSeeker;
import coding.hrms.entity.Dtos.JobSeekerResumeDto;
import org.springframework.stereotype.Component;

@Component
public class Converter {
    public JobSeekerResumeDto convertToCv(JobSeeker jobSeeker) {

        return new JobSeekerResumeDto(jobSeeker.getId(),
                jobSeeker.getName(),
                jobSeeker.getLastName(),
                jobSeeker.getForeignLanguages(),
                jobSeeker.getJobExperiences(),
                jobSeeker.getSchools(),
                jobSeeker.getResumeProperties()
        );
    }
}
