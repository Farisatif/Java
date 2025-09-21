public class pro1 {
    String id ,name ,address;
    void printData(){
        System.out.println("id "+id);
        System.out.println("name "+name);
        System.out.println("address "+address);

    }
    public pro1(){
        System.out.println("person");
    }
    public pro1(String id,String name , String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
