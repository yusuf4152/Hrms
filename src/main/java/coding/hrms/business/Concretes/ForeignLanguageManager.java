package coding.hrms.business.Concretes;
import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.Core.Results.SuccessDataResult;
import coding.hrms.Core.Results.SuccessResult;
import coding.hrms.business.Abstracts.ForeignLanguageService;
import coding.hrms.dataAcces.ForeignLanguageDao;
import coding.hrms.entity.Concretes.ForeignLanguage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ForeignLanguageManager implements ForeignLanguageService {
    private final ForeignLanguageDao foreignLanguageDao;

    @Override
    public Result add(ForeignLanguage foreignLanguage) {
        this.foreignLanguageDao.save(foreignLanguage);
        return new SuccessResult("data eklendi");
    }

    @Override
    public DataResult<List<ForeignLanguage>> getByJobSeekerIdOrderByLanguageLevel(int jobSeekerId) {
        return new SuccessDataResult<>(this.foreignLanguageDao.getByJobSeekerIdOrderByLanguageLevel(jobSeekerId),"data listelendi");
    }

}
