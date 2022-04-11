package coding.hrms.Core.Services.Concretes;
import coding.hrms.Core.Services.Abstracts.HrmsCheckService;
import coding.hrms.entity.Concretes.Employer;
import org.springframework.stereotype.Service;

@Service
public class HrmsCheckManager implements HrmsCheckService {
    @Override
    public boolean checkUser(Employer employer) {
        return true;
    }
}
