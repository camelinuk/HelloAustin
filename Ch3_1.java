public class Ch3_1{
  public static void main(String[] args){
    int i, j, max, sum , sumj;
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("max = ");
    max = sc.nextInt();
    sc.nextLine();
    System.out.println("   i|   j");
    for(i=0,j=9,sum=0,sumj=0; i < max; j--,i++){
      System.out.println("   "+i+"|   "+j);
      sum   += i;
      sumj  += j;
    }
    System.out.println("-------SUM");
    System.out.println("  "+sum +"|  "+sumj);
    System.out.print("\n");
  }
}