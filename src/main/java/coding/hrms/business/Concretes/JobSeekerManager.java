package coding.hrms.business.Concretes;

import coding.hrms.Core.Adapters.Abstracts.CheckServices;
import coding.hrms.Core.Results.*;
import coding.hrms.Core.Services.Abstracts.EmailCheckService;
import coding.hrms.business.Abstracts.JobseekerService;
import coding.hrms.entity.Dtos.Converter.Converter;
import coding.hrms.dataAcces.JobSeekerDao;
import coding.hrms.entity.Concretes.JobSeeker;
import coding.hrms.entity.Dtos.JobSeekerResumeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobSeekerManager implements JobseekerService {
    private final Converter converter;
    private final JobSeekerDao jobSeekerDao;
    private final EmailCheckService emailCheckService;
    private final CheckServices checkServices;
    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return  new SuccessDataResult(this.jobSeekerDao.findAll(),"data listelendi");
    }
    @Override
    public Result add(JobSeeker jobSeeker) throws Exception {
       if (!jobSeeker.getEmail().isEmpty()&& !jobSeeker.getNationalityId().isEmpty() && !String.valueOf(jobSeeker.getBirthYear()).isEmpty() && !jobSeeker.getName().isEmpty()&& !jobSeeker.getLastName().isEmpty()){
           if (!this.checkServices.CheckJobSeeker(jobSeeker)){
               return new ErrorResult("mernis doğrulamasından geçemedi");
           }
           if (!this.emailCheckService.checkEmail(jobSeeker.getEmail())){
               return new ErrorResult("email tekrar edemez");
           }
           if (this.jobSeekerDao.getByNationalityId(jobSeeker.getNationalityId())!=null){
               return new ErrorResult("tc no tekrar edemez");
           }
           this.jobSeekerDao.save(jobSeeker);
           return new SuccessResult("data kaydedildi");
       }
       return  new ErrorResult("tüm alanları doldur");
    }

    @Override
    public DataResult<List<JobSeekerResumeDto>> getJobSeekerCv(int jobSeekerId) {
        return new SuccessDataResult<List<JobSeekerResumeDto>>(this.jobSeekerDao.findById(jobSeekerId)
                .stream()
                .map(converter::convertToCv)
                .collect(Collectors.toList()),"cv getirildi");
    }
}
