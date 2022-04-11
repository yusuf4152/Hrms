package coding.hrms.Core.Results;

public class ErrorResult extends Result{
    public ErrorResult(String message){
        super(false,message);
    }
}
