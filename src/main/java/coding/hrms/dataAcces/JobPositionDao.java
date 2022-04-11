package coding.hrms.dataAcces;

import coding.hrms.entity.Concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer> {
    JobPosition getByJobTitle(String jobTitle);
}
