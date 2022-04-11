package coding.hrms.business.Abstracts;

import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.entity.Concretes.School;

import java.util.List;

public interface SchoolService {
    Result add(School school);
   DataResult <List<School>> getSchoolOrderByEndTime(int jobSeekerId);
}
