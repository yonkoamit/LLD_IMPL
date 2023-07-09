package ChainResponsibilityDesignPattern;

public class Main {
    public static void main(String args[]){
      LogProcessor logProcessor=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
      logProcessor.log(LogProcessor.ERROR,"Something went wrong");
        logProcessor.log(LogProcessor.DEBUG,"Debug this");
        logProcessor.log(LogProcessor.INFO,"This is info");

    }
}
