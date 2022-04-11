package coding.hrms.dataAcces;

import coding.hrms.entity.Concretes.Employer;
import coding.hrms.entity.Concretes.JobAdvertisement;
import coding.hrms.entity.Dtos.JobAdvertisementWithEmployerAndPositionDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
    Employer getByEmail(String mail);
}

