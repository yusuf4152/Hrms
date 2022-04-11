package coding.hrms.dataAcces;

import coding.hrms.entity.Concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

    JobSeeker getByEmail(String mail);
    JobSeeker getByNationalityId(String nationalityId);
}
