public class Ch2
{
    public static void main(String[] args) {
        String aFname, aLname, bFname, bLname;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("== Input reg. form for Student A ==");
        System.out.print("A First Name:");
        aFname = sc.nextLine(); // get the name from key in
        System.out.print("A Last Name : ");
        aLname = sc.nextLine(); // get the name from key in
        System.out.print("A Gender : ");
        String aGender = sc.nextLine(); // get the gender from key in
        System.out.print("A age:");
        int aAge = sc.nextInt(); // get the age from key in 
        sc.nextLine();
        System.out.println("== Input reg. form for Student B ==");
        System.out.print("B First Name:");
        bFname = sc.nextLine(); // get the name from key in
        System.out.print("B Last Name : ");
        bLname = sc.nextLine(); // get the name from key in
        System.out.print("B Gender : ");
        String bGender = sc.nextLine(); // get the gender from key in
        System.out.print("B Age:");
        int bAge = sc.nextInt(); // get the age from key in 
        System.out.println("Total Age : "+ (int) (bAge + aAge));
        System.out.println("======== Thanks for your help ======");
        System.out.println("Hi " + aFname +" & "+ bFname + ",");
        if (aAge > bAge){
            System.out.println ("student A ("+ aFname +") is older than student B ("+ bFname +") !");
        }else if(aAge < bAge){
            System.out.println ("student B ("+ bFname +") is older than student A ("+ aFname +") !");
        }else{
            System.out.println ("student B ("+ bFname +") is equal to student A ("+ aFname +") !");
        }
        switch(aGender){
            case "M" : System.out.println("Student A is a male.");break;
            case "F" : System.out.println("Student A is a female.");break;
            default: System.out.println("I don't understand your gender.");break;
        }
        System.out.println ("========================");
        System.out.println("Can you check it for me? Y/n ");
        String chk = sc.nextLine();
        check(chk);
    }
    public static void check(String args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("you chose : "+ args);
        if(args.equals("n")){
            System.out.print("Your choose is " + args);
            String[] arg= new String[1];
            arg[0] = args;
            main(arg);
        }
    }
}