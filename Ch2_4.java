
class Ch2_4{
  public static void main(String[] args){
      int max,k,x,$odd,$center;
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.print("Please input max num of star = ");
      max = sc.nextInt();
      $center =(int) Math.ceil(max/2);
      $odd = max % 2;
      sc.nextLine();
      for (int i=1; i <= max ; i++){
          //若是大於中心點
          if(i <= $center){
            x=0; //未過中線
            k=i; //k=i再遞增
          }else{
            x=1; //過中線後
            k=$center--; //k要遞減
          }
          //每一圈的第一行
          for(int j=0;j< k;j++){
              if(x==0) //未過中線
                System.out.print("* ");
              else //已過中線
                System.out.print(" *");
          }
          //換行
          System.out.println();
          //每一圈的第二行
          for(int j=0;j< k;j++){
            if(x==0) //未過中線
            System.out.print(" *");
            else  //已過中線
            System.out.print("* ");
          }
          //換行
          System.out.println();
          //若是有單數最大行，用於顯示中線
          if(i==$center && $odd==1){
            for(int q=0;q<k+1;q++){
                System.out.print("* ");
            }
            System.out.println();
          }        
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