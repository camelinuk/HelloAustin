class Ch2_4{
  public static void main(String[] args){
      int max,k,x, ceil;
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.print("Please input max num of star = ");
      max = sc.nextInt();
      ceil =(int) Math.ceil(max/2);
      sc.nextLine();
      for (int i=1; i <= max ; i++){
        if(i > ceil){
          x=1;
          k=ceil--;
        }else{
          x=0;
          k=i;
        }
        for(int j=0;j< k;j++){
          if(x==0)
          System.out.print("* ");
          else
          System.out.print(" *");
        }
        System.out.println();
        for(int j=0;j< k;j++){
          if(x==0)
          System.out.print(" *");
          else
          System.out.print("* ");
        }
        System.out.println();
      }
  }
  private static void space(Integer iNum){
    for(int i=0; i<iNum;i++ ){
     System.out.print(" ");
    }
  }
  private static void star(Integer iNum){
    for(int i=0; i<iNum;i++ ){
     System.out.print("* ");
    }
  }
}