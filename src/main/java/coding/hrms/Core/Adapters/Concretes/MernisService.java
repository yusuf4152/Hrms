package coding.hrms.Core.Adapters.Concretes;

import Mernisreference.CDWKPSPublicSoap;
import coding.hrms.Core.Adapters.Abstracts.CheckServices;
import coding.hrms.entity.Concretes.JobSeeker;
import org.springframework.stereotype.Service;
@Service
public class MernisService implements CheckServices {
    @Override
    public boolean CheckJobSeeker(JobSeeker jobSeeker) throws Exception {
        CDWKPSPublicSoap cdwkpsPublicSoap= new CDWKPSPublicSoap();
      boolean result=  cdwkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalityId()),jobSeeker.getName(),jobSeeker.getLastName(),jobSeeker.getBirthYear());
        return result;
    }
}
