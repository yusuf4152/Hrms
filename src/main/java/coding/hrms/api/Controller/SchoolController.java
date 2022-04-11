package coding.hrms.api.Controller;
import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.business.Abstracts.SchoolService;
import coding.hrms.entity.Concretes.School;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/School")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;
   @PostMapping("/add")
    public Result add(@RequestBody School school){
     return this.schoolService.add(school);
 }

   @GetMapping("/getJobSeekerSchoolOrderByEndTime")
    public DataResult<List<School>> getSchoolOrderByEndTime(@RequestParam int jobSeekerId) {
        return schoolService.getSchoolOrderByEndTime(jobSeekerId);
    }
}
