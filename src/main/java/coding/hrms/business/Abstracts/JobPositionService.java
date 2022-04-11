package coding.hrms.business.Abstracts;

import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.entity.Concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
   DataResult <List<JobPosition>> getAll();
   Result add(JobPosition jobPosition);
}
