package coding.hrms.business.Abstracts;

import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.entity.Concretes.JobAdvertisement;
import coding.hrms.entity.Dtos.JobAdvertisementWithEmployerAndPositionDto;

import javax.xml.crypto.Data;
import java.util.List;

public interface JobAdvertisementService {
    DataResult<List<JobAdvertisement>> getAll();
    DataResult<List<JobAdvertisementWithEmployerAndPositionDto>> getActiveJobAdvertisement();
     Result add(JobAdvertisement jobAdvertisement);
   DataResult<List<JobAdvertisementWithEmployerAndPositionDto>> getActiveJobAdvertisementOrderByDate();
    DataResult <List<JobAdvertisementWithEmployerAndPositionDto>> getCompanyNameJobAdvertisement(String employerName);
     Result closeJobAdvertisement(int id, boolean isActive);

}
