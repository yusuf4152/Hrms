package coding.hrms.Core.Results;

public class ErrorDataResult <T> extends DataResult{
    public ErrorDataResult(T data, String message, boolean success) {
        super(data, message, false);
    }
}
