package coding.hrms.api.Controller;
import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.business.Abstracts.JobPositionService;
import coding.hrms.entity.Concretes.JobPosition;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionController {
    private final JobPositionService jobPositionService;
    @GetMapping("/getAll")
    public DataResult <List<JobPosition>>getAll(){
   return this.jobPositionService.getAll();
     }
     @PostMapping("/add")
     public Result add(@RequestBody JobPosition jobPosition){
     return this.jobPositionService.add(jobPosition);
     }
}
