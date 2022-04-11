package coding.hrms.api.Controller;

import coding.hrms.Core.Results.DataResult;
import coding.hrms.Core.Results.Result;
import coding.hrms.business.Abstracts.JobAdvertisementService;
import coding.hrms.entity.Concretes.JobAdvertisement;
import coding.hrms.entity.Dtos.JobAdvertisementWithEmployerAndPositionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementController {
    private final JobAdvertisementService jobAdvertisementService;
    @PostMapping("/add")
     public Result Add(@RequestBody JobAdvertisement jobAdvertisement){
            return this.jobAdvertisementService.add(jobAdvertisement);
     }
     @GetMapping("getActiveJobAdvertisement")
    public DataResult<List<JobAdvertisementWithEmployerAndPositionDto>> getActiveJobAdvertisement(){
            return this.jobAdvertisementService.getActiveJobAdvertisement();
    }
    @GetMapping("getActiveJobAdvertisementOrderByDate")
  public DataResult <List<JobAdvertisementWithEmployerAndPositionDto>> getActiveJobAdvertisementOrderByDate(){
        return this.jobAdvertisementService.getActiveJobAdvertisementOrderByDate();
  }
    @GetMapping("getCompanyNameJobPostings")
    DataResult<List<JobAdvertisementWithEmployerAndPositionDto>> getCompanyNameJobPostings(@RequestParam String employerName){
        return this.jobAdvertisementService.getCompanyNameJobAdvertisement(employerName);
    }
    @PutMapping("closeJobAdvertisement")
    public Result closeJobAdvertisement(@RequestParam int id,@RequestParam boolean isActive){
    return this.jobAdvertisementService.closeJobAdvertisement(id, isActive);
    }
    @GetMapping("getAll")
    public DataResult<List<JobAdvertisement>> getAll(){
        return this.jobAdvertisementService.getAll();
    }
}
