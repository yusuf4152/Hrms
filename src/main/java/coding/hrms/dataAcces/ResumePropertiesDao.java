package coding.hrms.dataAcces;

import coding.hrms.entity.Concretes.ResumeProperties;
import coding.hrms.entity.Dtos.JobSeekerResumeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ResumePropertiesDao extends JpaRepository<ResumeProperties,Integer> {

}
