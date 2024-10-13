public class Ch2
{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Input some data:");
        System.out.print("Your Name:");
        String name=sc.nextLine(); // get the name from key in
        System.out.print("Your Gender:");
        String gender = sc.nextLine(); // get the gender from key in
        System.out.print("Your height:");
        Double height = sc.nextDouble(); // get the Height from key in 
        System.out.println("========");
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println ("Height : " + height);
    }
}