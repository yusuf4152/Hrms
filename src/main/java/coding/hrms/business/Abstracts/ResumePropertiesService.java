package coding.hrms.business.Abstracts;

import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.entity.Concretes.ResumeProperties;
import coding.hrms.entity.Dtos.JobSeekerResumeDto;

import java.util.List;

public interface ResumePropertiesService {
    Result add(ResumeProperties resume);
}
