package coding.hrms.Core.Adapters.Abstracts;
import coding.hrms.entity.Concretes.JobSeeker;

public interface CheckServices{
    boolean CheckJobSeeker(JobSeeker jobSeeker) throws Exception;
}
