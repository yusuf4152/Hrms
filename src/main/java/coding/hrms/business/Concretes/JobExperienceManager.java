package coding.hrms.business.Concretes;
import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.Core.Results.SuccessDataResult;
import coding.hrms.Core.Results.SuccessResult;
import coding.hrms.business.Abstracts.JobExperienceService;
import coding.hrms.dataAcces.JobExperienceDao;
import coding.hrms.entity.Concretes.JobExperience;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JobExperienceManager implements JobExperienceService {
    private final JobExperienceDao jobExperienceDao;

    @Override
    public Result add(JobExperience jobExperience) {
    this.jobExperienceDao.save(jobExperience);
        return new SuccessResult("data eklendi");
    }

    @Override
    public DataResult<List<JobExperience>> getByJobSeekerIdOrderByEndTime(int jobSeekerId){
        return new SuccessDataResult<>(this.jobExperienceDao.getByJobSeekerIdOrderByEndTime(jobSeekerId),"data listelendi");
    }

}
