package coding.hrms.business.Concretes;
import coding.hrms.Core.Results.*;
import coding.hrms.business.Abstracts.JobPositionService;
import coding.hrms.dataAcces.JobPositionDao;
import coding.hrms.entity.Concretes.JobPosition;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class JobPositionManager implements JobPositionService {
    private final JobPositionDao jobPositionDao;
    @Override
    public DataResult <List<JobPosition>> getAll() {
    return new SuccessDataResult<>(this.jobPositionDao.findAll(),"data listelendi");
    }

    @Override
    public Result add(JobPosition jobPosition) {
        if (this.jobPositionDao.getByJobTitle(jobPosition.getJobTitle())!=null){
            return new ErrorResult("job title parametresi tekrarlanamaz");
        }
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult("data eklendi");
    }

}



