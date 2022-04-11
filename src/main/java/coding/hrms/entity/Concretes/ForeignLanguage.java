package coding.hrms.entity.Concretes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "foreignlanguage")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class ForeignLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "languagename")
    private String languageName;


    @Column(name = "languagelevel")
    private int languageLevel;


    @ManyToOne
    @JoinColumn(name = "jobseekerid")
    private JobSeeker jobSeeker;


}
