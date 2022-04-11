package coding.hrms.business.Abstracts;

import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.entity.Concretes.JobExperience;

import java.util.List;

public interface JobExperienceService {
     Result add(JobExperience jobExperience);
     DataResult<List<JobExperience>> getByJobSeekerIdOrderByEndTime(int jobSeekerId);
}
