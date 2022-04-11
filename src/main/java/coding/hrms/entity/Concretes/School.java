package coding.hrms.entity.Concretes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "scholls")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class School {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
  private  int id;

    @Column(name = "name")
   private String name;

    @Column(name = "begintime")
   private LocalDate beginTime;

    @Column(name = "endtime")
    private LocalDate endTime;

    @ManyToOne
    @JoinColumn(name = "jobseekerid")
    private JobSeeker jobSeeker;

}
