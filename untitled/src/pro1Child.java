public class pro1Child extends pro1 {
    String level,dep;

public pro1Child(){
    System.out.println("Child");
}
public pro1Child(String id, String name, String address,String level,String dep){
    super(id,name,address);
    this.level = level;
    this.dep = dep;
}
public void printDataChild(){

    super.printData();
    System.out.println("Level "+level);
    System.out.println("Dep "+dep);


}

}
