package coding.hrms.dataAcces;

import coding.hrms.entity.Concretes.JobExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobExperienceDao extends JpaRepository<JobExperience,Integer>{
    List<JobExperience> getByJobSeekerIdOrderByEndTime(int jobSeekerId);
}
