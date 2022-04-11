package coding.hrms.entity.Concretes;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employers")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class Employer extends User{

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name="company_name")
    private String companyName;

    @Column(name = "web_address")
    private String webSite;

    @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;


}
