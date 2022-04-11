package coding.hrms.entity.Concretes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "resumeproperties")
public class ResumeProperties {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private int id;

   @Column(name = "githublink")
   private String gitHubLink;

   @Column(name = "linkedinlink")
   private String LinkedInLink;

   @Column(name = "photourl")
   private String photoUrl;

   @Column(name = "coverletter")
   private String CoverLetter;

   @ManyToOne
   @JoinColumn(name = "jobseekerid")
   private JobSeeker jobSeeker;

}
