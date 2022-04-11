package coding.hrms.business.Concretes;
import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.Core.Results.SuccessDataResult;
import coding.hrms.Core.Results.SuccessResult;
import coding.hrms.business.Abstracts.SchoolService;
import coding.hrms.dataAcces.SchoolDao;
import coding.hrms.entity.Concretes.School;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolManager implements SchoolService {
   private final SchoolDao schoolDao;

    @Override
    public Result add(School school) {
       this.schoolDao.save(school);
        return new SuccessResult("okul eklendi");
    }

    @Override
    public DataResult<List<School>> getSchoolOrderByEndTime(int jobSeekerId) {
        return new SuccessDataResult<>(this.schoolDao.getByJobSeekerIdOrderByEndTime(jobSeekerId),"data listelendi");
    }
}
