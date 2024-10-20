public class Ch3{
  public static void main(String[] args){
    int i, max, sum =0;
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("Pls key-in a max number: ");
    max = sc.nextInt();
    sc.nextLine();
    for(i=0; i < max; i++){
      System.out.println(i);
      sum += i;
    }
    System.out.println("Total sum : "+sum);
  }
}