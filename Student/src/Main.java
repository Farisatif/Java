import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int id;
        String name;
        int [] mark;

        System.out.println("Enter The Lingth of Arrey : ");
int Lingth = input.nextInt();
mark = new int[Lingth];
        System.out.println("Enter The Name : ");
        name = input.next();

        System.out.println("Enter The id : ");
        id = input.nextInt();



for(int i = 0 ; i < mark.length ; i++){

    System.out.println("Enter The Value "+(i+1));
    mark[i] = input.nextInt();
}
        one d = new one(id,name,mark);

    }
}