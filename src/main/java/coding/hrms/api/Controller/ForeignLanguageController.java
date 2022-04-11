package coding.hrms.api.Controller;
import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.business.Abstracts.ForeignLanguageService;
import coding.hrms.entity.Concretes.ForeignLanguage;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/ForeignLanguage")
@RequiredArgsConstructor
public class ForeignLanguageController {
    private final ForeignLanguageService foreignLanguageService;

    @PostMapping("/add")
    public Result add(@RequestBody ForeignLanguage foreignLanguage){
        return this.foreignLanguageService.add(foreignLanguage);
    }
    @GetMapping("/getByJobSeekerOrderByLanguageLevel")
    public DataResult<List<ForeignLanguage>> getByJobSeekerOrderByLanguageLevel(@RequestParam int jobSeekerId) {
        return  this.foreignLanguageService.getByJobSeekerIdOrderByLanguageLevel(jobSeekerId);
    }
}
