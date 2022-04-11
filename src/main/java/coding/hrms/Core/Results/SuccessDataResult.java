package coding.hrms.Core.Results;

public class SuccessDataResult <T> extends DataResult{
    public SuccessDataResult(T data, String message) {
        super(data, message, true);
    }
}
