package coding.hrms.Core.Services.Abstracts;

import coding.hrms.entity.Concretes.Employer;

public interface HrmsCheckService {
  boolean checkUser(Employer employer);
}
