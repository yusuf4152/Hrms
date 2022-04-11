package coding.hrms.api.Controller;
import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.business.Abstracts.JobExperienceService;
import coding.hrms.entity.Concretes.JobExperience;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/JobExperience")
@RequiredArgsConstructor
public class JobExperienceController {
    private final JobExperienceService jobExperienceService;

    @PostMapping("/add")
    public Result add(@RequestBody JobExperience jobExperience){
        return this.jobExperienceService.add(jobExperience);
    }

    @GetMapping("/getByJobSeekerIdOrderByEndTime")
    public DataResult<List<JobExperience>> getByJobSeekerIdOrderByEndTime(@RequestParam int jobSeekerId) {
        return this.jobExperienceService.getByJobSeekerIdOrderByEndTime(jobSeekerId);
    }
}
