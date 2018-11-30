public class MyCalculator_Test {
  private static MyCalculator calc = new MyCalculator();

  public static final String ANSI_RED    = "\u001B[31m";
  public static final String ANSI_GREEN  = "\u001B[32m";
  public static final String ANSI_RESET  = "\u001B[0m";

  private static boolean test_StartValueOfFirstNumber(){
    double temp = calc.getFirstNumber();
    if(0 == temp){
      return true;
    }
    return false;
  }
  private static boolean test_StartValueOfSecondNumber(){
    double temp = calc.getSecondNumber();
    if(0 == temp){
      return true;
    }
    return false;
  }
  private static boolean test_StartValueOfAnswer(){
    double temp = calc.getAnswer();
    if(0 == temp){
      return true;
    }
    return false;
  }
  private static boolean test_StartValueOfOperator(){
    String temp = calc.getOperator();
    if(temp == "-1"){
      return true;
    }
    return false;
  }

  public static void main(String[] args){
    int totalAmountOfErros = 0;
    if(test_StartValueOfFirstNumber()){
      System.out.println("SV FirstNumber: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    } else {
      System.out.println("SV FirstNumber: " + ANSI_RED + "FAILED"+ ANSI_RESET);
      totalAmountOfErros++;
    }
    if(test_StartValueOfSecondNumber()){
      System.out.println("SV SecondNumber: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    } else {
      System.out.println("SV SecondNumber: " + ANSI_RED + "FAILED"+ ANSI_RESET);
      totalAmountOfErros++;
    }
    if(test_StartValueOfAnswer()){
      System.out.println("SV Answer: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    } else {
      System.out.println("SV Answer: " + ANSI_RED + "FAILED"+ ANSI_RESET);
      totalAmountOfErros++;
    }
    if(test_StartValueOfOperator()){
      System.out.println("SV Operaotr: " + ANSI_GREEN + "PASSED"+ ANSI_RESET);
    } else {
      System.out.println("SV Operator: " + ANSI_RED + "FAILED"+ ANSI_RESET);
      totalAmountOfErros++;
    }
  }
}
