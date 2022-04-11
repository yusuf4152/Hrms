package coding.hrms.dataAcces;

import coding.hrms.entity.Concretes.ForeignLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ForeignLanguageDao extends JpaRepository<ForeignLanguage,Integer> {

    List<ForeignLanguage> getByJobSeekerIdOrderByLanguageLevel(int jobSeekerId);


}
