package coding.hrms.api.Controller;

import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.business.Abstracts.JobseekerService;
import coding.hrms.entity.Concretes.JobSeeker;
import coding.hrms.entity.Dtos.JobSeekerResumeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobSeekers")
@RequiredArgsConstructor
public class JobSeekerController {
    private  final JobseekerService jobseekerService;
    @GetMapping("/getAll")
    public DataResult<List<JobSeeker>> getAll(){
        return this.jobseekerService.getAll();
    }
   @PostMapping("/add")
    public Result add(@RequestBody JobSeeker jobSeeker) throws Exception {
        return this.jobseekerService.add(jobSeeker);
    }
    @GetMapping("/getJobSeekerCv")
    public DataResult<List<JobSeekerResumeDto>> getJobSeekerCv(@RequestParam int jobSeekerId){
        return this.jobseekerService.getJobSeekerCv(jobSeekerId);
    }
}
