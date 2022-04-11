package coding.hrms.dataAcces;

import coding.hrms.entity.Concretes.SystemUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUsersDao extends JpaRepository<SystemUsers,Integer> {
}
