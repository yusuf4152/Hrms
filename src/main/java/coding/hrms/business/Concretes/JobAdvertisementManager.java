package coding.hrms.business.Concretes;
import coding.hrms.Core.Results.*;
import coding.hrms.business.Abstracts.JobAdvertisementService;
import coding.hrms.dataAcces.JobAdvertisementDao;
import coding.hrms.entity.Concretes.JobAdvertisement;
import coding.hrms.entity.Dtos.JobAdvertisementWithEmployerAndPositionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JobAdvertisementManager implements JobAdvertisementService {
    private final JobAdvertisementDao jobAdvertisementDao;

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        jobAdvertisement.setReleaseDate(LocalDate.now());
        jobAdvertisement.setActive(true);
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("data eklendi");
    }

    @Override
    public DataResult<List<JobAdvertisementWithEmployerAndPositionDto>> getActiveJobAdvertisementOrderByDate() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.getActiveJobAdvertisementOrderByDate(),"data listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisementWithEmployerAndPositionDto>> getCompanyNameJobAdvertisement(String employerName) {
        return new SuccessDataResult<>(this.jobAdvertisementDao.getCompanyNameJobAdvertisement(employerName),"data listlendi");
    }

    @Override
    public Result closeJobAdvertisement(int id, boolean isActive){
        JobAdvertisement jobAdvertisement = jobAdvertisementDao.findById(id).get();
        jobAdvertisement.setActive(isActive);
        jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("iş ilanı kapatıldı");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAll(),"data listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisementWithEmployerAndPositionDto>> getActiveJobAdvertisement() {
      return new SuccessDataResult<>(this.jobAdvertisementDao.getActiveJobAdvertisementDetails(),"data listelendi");
    }
}
