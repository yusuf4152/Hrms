package coding.hrms.business.Concretes;
import coding.hrms.Core.Results.Result;
import coding.hrms.Core.Results.SuccessResult;
import coding.hrms.business.Abstracts.ResumePropertiesService;
import coding.hrms.dataAcces.ResumePropertiesDao;
import coding.hrms.entity.Concretes.ResumeProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ResumePropertiesManager implements ResumePropertiesService {
    private final ResumePropertiesDao resumePropertiesDao;
    @Override
    public Result add(ResumeProperties resume) {
        this.resumePropertiesDao.save(resume);
        return  new SuccessResult("cv eklendi");
    }

}
