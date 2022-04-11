package coding.hrms.api.Controller;
import coding.hrms.Core.Results.Result;
import coding.hrms.business.Abstracts.ResumePropertiesService;
import coding.hrms.entity.Concretes.ResumeProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Resume")
@RequiredArgsConstructor
public class ResumePropertiesController {
    private final ResumePropertiesService resumeService;

    @PostMapping("/add")
    public Result add(@RequestBody ResumeProperties resume){
        return this.resumeService.add(resume);
    }

}









