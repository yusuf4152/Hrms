package coding.hrms.business.Abstracts;

import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.entity.Concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult <List<Employer>> getAll();
    Result add(Employer employer);
}
