import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("how many phrases do you want :)");
    int times = scan.nextInt();
    scan.close();
   FlavorText text = new FlavorText(times);
   text.printem(); 
    ///////////////////////
    //code below is my funzies code to make this feel more like home :)
if (times == 0){
    System.out.println("you thought I would not account for this did you mere mortal!");
  }
  else if(times == 69|| times == 420 || times == 69420|| times == 42069){
    System.out.println("nice");
  }
  else if(times < 0){
    System.out.println("very funny I laughed");
    throw new ArithmeticException("NOT funny didn't laugh, you should be ashamed of your self trying to break programs for fun man you deserve to have this error thrown in your face lmao ur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumbur dumber");//I love this keyword
  }
  else{
    System.out.println("donzo");
  }
  }
  
}