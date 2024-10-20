public class Ch2
{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter your first name");
        System.out.print("Your first name: ");
        String name = sc.nextLine();
        System.out.println("enter your last name");
        System.out.print("Your last name: ");
        String name2 = sc.nextLine();
        System.out.println("enter his/her first name");
        System.out.print("his/her first name: ");
        String name3 = sc.nextLine();
        System.out.println("enter his/her last name");
        System.out.print("his/her last name: ");
        String name4 = sc.nextLine();
        System.out.println("enter your gender:");
        System.out.print("your gender: ");
        String gender = sc.nextLine();
        System.out.println("enter your age");
        System.out.print("your age: ");
        Double age1 = sc.nextDouble();
        System.out.println("enter his age");
        System.out.print("his age: ");
        Double age2 = sc.nextDouble();
        Double totalAge = age1 + age2;
        if (age1 > age2)
            System.out.println("you are older than " + name3);
        else if (age1 = age2)
            System.out.println("you guys have the same age");
        else
            System.out.println(" you are younger than " + name3);
        System.out.println("Your first name is " + name);
        System.out.println("Your last name is " + name2);
        System.out.println("his/her first name is " + name3);
        System.out.println("his/her last name is" + name4);
        System.out.println("Your gender is " + gender);
        System.out.println("The sum of your age and his age is " + totalAge);
    }
}
