package coding.hrms.business.Concretes;
import coding.hrms.Core.Results.*;
import coding.hrms.Core.Services.Abstracts.EmailCheckService;
import coding.hrms.Core.Services.Abstracts.HrmsCheckService;
import coding.hrms.business.Abstracts.EmployerService;
import coding.hrms.dataAcces.EmployerDao;
import coding.hrms.entity.Concretes.Employer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployerManager implements EmployerService {

    private final EmployerDao employerDao;
    private final HrmsCheckService hrmsCheckService;
    private final EmailCheckService emailCheckService;
    @Override
    public DataResult <List<Employer>> getAll(){
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"data listelendi");
    }

   @Override
    public Result add(Employer employer){
          if (!employer.getEmail().isEmpty() && !employer.getWebSite().isEmpty() && !employer.getPassword().isEmpty() && !employer.getCompanyName().isEmpty() && !employer.getPhoneNumber().isEmpty()){
              employerDao.save(employer);
             if (this.emailCheckService.checkEmail(employer.getEmail())){
                 return new ErrorResult("email tekrar edemez");
             }
             if (!this.hrmsCheckService.checkUser(employer)){
                 return new ErrorResult("hrms doğrulama hatası");
             }
              return new SuccessResult("data kaydedildi");
          }
      return new ErrorResult("tüm alanları doldur");
     }
}
