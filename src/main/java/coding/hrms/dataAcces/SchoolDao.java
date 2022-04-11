package coding.hrms.dataAcces;

import coding.hrms.Core.Results.DataResult;
import coding.hrms.entity.Concretes.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SchoolDao extends JpaRepository<School,Integer>{
    List<School> getByJobSeekerIdOrderByEndTime(int jobSeekerId);
}
