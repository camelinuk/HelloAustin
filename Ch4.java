
import java.lang.classfile.instruction.ThrowInstruction;

public class Ch4{
  public static void main(String[] args) {
      java.util.Scanner $sc = new java.util.Scanner(System.in);
      System.out.print("請選擇要轉成攝氏(c)或華氏(f)：");
      String $cf = $sc.next();
      System.out.println("請輸入要轉換的度數:");
      float inp = $sc.nextFloat();
      switch($cf){
        case 'cf':
            float ch = fahrenheit(inp);
          break;
        case 'f':
            float ch = celisius(inp);
          break;
        default:
            System.out.print("請從新輸入轉成攝氏(c)或華氏(f)：");
            String $cf = $sc.next();
          break;
      }

  }
  private static float celisius(Float flo){
    return flo;
  }
  private static float fahrenheit(Float flo){
    return flo;
  }
}