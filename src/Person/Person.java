package Person;

public class Person {
    String name;
    int age;
    String address;
    public Person (String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void display(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    public static void main(String[] args){
        Person p1 = new Person("Dung", 20, "Dong HOi");
        p1.display();
        Student st = new Student("Long",20,"Le thuy",4);
        st.display();
        Teacher tc = new Teacher("GV A",33,"Viet Nam",400000);
        tc.display();
    }

}
