package coding.hrms.Core.Services.Concretes;

import coding.hrms.Core.Services.Abstracts.EmailCheckService;
import coding.hrms.dataAcces.EmployerDao;
import coding.hrms.dataAcces.JobSeekerDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EMailManager implements EmailCheckService {
   private final EmployerDao employerDao;
   private final JobSeekerDao jobSeekerDao;
    @Override
    public boolean checkEmail(String eMail) {
        if (this.jobSeekerDao.getByEmail(eMail)!=null ||this.employerDao.getByEmail(eMail)!=null){
            return false;
        }
        return true;
    }
}
