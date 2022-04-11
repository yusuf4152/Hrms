package coding.hrms.dataAcces;
import coding.hrms.Core.Results.DataResult;
import coding.hrms.entity.Concretes.JobAdvertisement;
import coding.hrms.entity.Dtos.JobAdvertisementWithEmployerAndPositionDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

    @Query("select new coding.hrms.entity.Dtos.JobAdvertisementWithEmployerAndPositionDto(e.companyName,i.jobTitle,j.numberOfPositions,j.lastApplicationDate,j.releaseDate) from Employer e inner join e.jobAdvertisements j inner Join j.jobPosition i where j.isActive=true")
    List<JobAdvertisementWithEmployerAndPositionDto> getActiveJobAdvertisementDetails();

    @Query("select new coding.hrms.entity.Dtos.JobAdvertisementWithEmployerAndPositionDto(e.companyName,i.jobTitle,j.numberOfPositions,j.lastApplicationDate,j.releaseDate) from Employer e inner join e.jobAdvertisements j inner Join j.jobPosition i where j.isActive=true order by j.lastApplicationDate desc ")
    List<JobAdvertisementWithEmployerAndPositionDto> getActiveJobAdvertisementOrderByDate();

    @Query("select new coding.hrms.entity.Dtos.JobAdvertisementWithEmployerAndPositionDto(e.companyName,i.jobTitle,j.numberOfPositions,j.lastApplicationDate,j.releaseDate) from Employer e inner join e.jobAdvertisements j inner Join j.jobPosition i where j.isActive=true and e.companyName=:employerName")
    List<JobAdvertisementWithEmployerAndPositionDto> getCompanyNameJobAdvertisement(String employerName);

}
