class Ch2_1{
  public static void main(String[] args){
      int max=0;
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.print("Please input max num of star = ");
      max = sc.nextInt();
      //max = max * 2;
      sc.nextLine();
      for (int i=1; i <= max ; i++){
        //space(max-i);star(i);
        for(int j=0; j<max; j++){
           if(j<max-i){
            System.out.print(" ");
           }else{
            System.out.print("*");
           }
        }
        System.out.println();
      }
  }
}