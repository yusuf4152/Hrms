package coding.hrms.entity.Concretes;
import lombok.Data;
import javax.persistence.*;

@Data
@MappedSuperclass
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
}
