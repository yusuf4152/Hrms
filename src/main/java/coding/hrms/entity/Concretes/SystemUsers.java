package coding.hrms.entity.Concretes;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "systemusers")
@Data
public class SystemUsers {
    @Id
    @Column(name = "userid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private  String name;

    @Column(name = "lastname")
    private  String lastName;
}
