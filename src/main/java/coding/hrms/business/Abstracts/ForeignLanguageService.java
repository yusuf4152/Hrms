package coding.hrms.business.Abstracts;

import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.entity.Concretes.ForeignLanguage;

import java.util.List;

public interface ForeignLanguageService {
    Result add(ForeignLanguage foreignLanguage);

      DataResult<List<ForeignLanguage>>  getByJobSeekerIdOrderByLanguageLevel(int joSeekerId);
}
