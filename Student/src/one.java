public class one {

int id;
String name;
int mark[];
    int sum = 0;

  public one(int id ,String name ,int mark[]){

      System.out.println("Hi");
this.id = id;
this.name = name;
this.mark = mark;

      System.out.println("Id is : " +id);
      System.out.println("Name is : "+name);
      for(int i = 0 ; i < mark.length ; i++){

          System.out.println("Mark Number "+(i+1)+" is "+ mark[i]);
 sum += mark[i];
      }
      System.out.println("Sum is : "+sum);
      System.out.println("Avrag is : "+sum/mark.length+"%");

    }

}
