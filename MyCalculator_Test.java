public class MyCalculator_Test {
  private static MyCalculator calc = new MyCalculator();

  public static final String ANSI_RED    = "\u001B[31m";
  public static final String ANSI_GREEN  = "\u001B[32m";
  public static final String ANSI_RESET  = "\u001B[0m";

  private static boolean test_StartValueOfFirstNumber(){
    calc.reset();
    double temp = calc.getFirstNumber();
    if(0 == temp){
      return true;
    }
    return false;
  }
  private static boolean test_StartValueOfSecondNumber(){
    calc.reset();
    double temp = calc.getSecondNumber();
    if(0 == temp){
      return true;
    }
    return false;
  }
  private static boolean test_StartValueOfAnswer(){
    calc.reset();
    double temp = calc.getAnswer();
    if(10 == temp){
      return true;
    }
    return false;
  }
  private static boolean test_StartValueOfOperator(){
    calc.reset();
    String temp = calc.getOperator();
    if(temp == "-1"){
      return true;
    }
    return false;
  }
  private static boolean test_AddMethod(){
    double temp1 = 1.3, temp2 = 3.2, correctAnswer = temp1+temp2;
    double calculatedAnswer = calc.callAdd(temp1, temp2);
    if(correctAnswer == calculatedAnswer){
      return true;
    }
    return false;
  }
  private static boolean test_SubMethod(){
    double temp1 = 1.3, temp2 = 3.2, correctAnswer = temp1-temp2;
    double calculatedAnswer = calc.callSub(temp1, temp2);
    if(correctAnswer == calculatedAnswer){
      return true;
    }
    return false;
  }
  private static boolean test_MultMethod(){
    double temp1 = 1.3, temp2 = 3.2, correctAnswer = temp1*temp2;
    double calculatedAnswer = calc.callMult(temp1, temp2);
    if(correctAnswer == calculatedAnswer){
      return true;
    }
    return false;
  }
  private static boolean test_DivMethod(){
    double temp1 = 1.3, temp2 = 3.2, correctAnswer = temp1*temp2;
    double calculatedAnswer = calc.callDiv(temp1, temp2);
    if(correctAnswer == calculatedAnswer){
      return true;
    }
    return false;
  }

  public static void main(String[] args){
    int totalAmountOfErros = 0;
    if(test_StartValueOfFirstNumber()){
      System.out.printf("%-20s"+ANSI_GREEN+"%s%n"+ANSI_RESET,"SV FirstNumber", "PASSED");
    } else {
      System.out.printf("%-40s"+ANSI_RED+"%s%n"+ANSI_RESET,"SV FirstNumber", "FAILED");
      totalAmountOfErros++;
    }
    if(test_StartValueOfSecondNumber()){
      System.out.printf("%-20s"+ANSI_GREEN+"%s%n"+ANSI_RESET,"SV SecondNumber", "PASSED");
    } else {
      System.out.printf("%-40s"+ANSI_RED+"%s%n"+ANSI_RESET,"SV SecondNumber", "FAILED");
      totalAmountOfErros++;
    }

    if(test_StartValueOfOperator()){
      System.out.printf("%-20s"+ANSI_GREEN+"%s%n"+ANSI_RESET,"SV Operator", "PASSED");
    } else {
      System.out.printf("%-40s"+ANSI_RED+"%s%n"+ANSI_RESET,"SV Operator", "FAILED");
      totalAmountOfErros++;
    }
    if(test_StartValueOfAnswer()){
      System.out.printf("%-20s"+ANSI_GREEN+"%s%n"+ANSI_RESET,"SV Answer", "PASSED");
    } else {
      System.out.printf("%-40s"+ANSI_RED+"%s%n"+ANSI_RESET,"SV Answer", "FAILED");
      totalAmountOfErros++;
    }
    if(test_AddMethod()){
      System.out.printf("%-20s"+ANSI_GREEN+"%s%n"+ANSI_RESET,"Add Method", "PASSED");
    } else {
      System.out.printf("%-40s"+ANSI_RED+"%s%n"+ANSI_RESET,"Add Method", "FAILED");
      totalAmountOfErros++;
    }

    if(test_SubMethod()){
      System.out.printf("%-20s"+ANSI_GREEN+"%s%n"+ANSI_RESET,"Sub Method", "PASSED");
    } else {
      System.out.printf("%-40s"+ANSI_RED+"%s%n"+ANSI_RESET,"Sub Method", "FAILED");
      totalAmountOfErros++;
    }
    if(test_MultMethod()){
      System.out.printf("%-20s"+ANSI_GREEN+"%s%n"+ANSI_RESET,"Mult Method", "PASSED");
    } else {
      System.out.printf("%-40s"+ANSI_RED+"%s%n"+ANSI_RESET,"Mult Method", "FAILED");
      totalAmountOfErros++;
    }
    if(test_DivMethod()){
      System.out.printf("%-20s"+ANSI_GREEN+"%s%n"+ANSI_RESET,"Div Method", "PASSED");
    } else {
      System.out.printf("%-40s"+ANSI_RED+"%s%n"+ANSI_RESET,"Div Method", "FAILED");
      totalAmountOfErros++;
    }
    System.out.println("Total amount of errors: "+totalAmountOfErros);
  }
}
