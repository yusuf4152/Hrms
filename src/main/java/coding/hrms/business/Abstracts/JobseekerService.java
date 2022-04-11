package coding.hrms.business.Abstracts;

import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.entity.Concretes.JobSeeker;
import coding.hrms.entity.Dtos.JobSeekerResumeDto;

import java.util.List;

public interface JobseekerService {
    DataResult getAll();
    Result add(JobSeeker jobSeeker) throws Exception;
    DataResult<List<JobSeekerResumeDto>> getJobSeekerCv(int jobSeekerId);
}
