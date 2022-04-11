package coding.hrms.Core.Results;

 public class DataResult <T> extends Result{
    private T data;
   public DataResult(T data,String message,boolean success){
      super(success,message);
      this.data= data;
     }
    public T getData(){
    return this.data;
    }
 }
