public class Person2 implements Comparable<Person2>{
    // Write Your Code Here
    String name;
    int age;
    int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Person2(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Person2 [name=" + name + ", age=" + age + ", id=" + id + "]";
    }
    @Override
    public int compareTo(Person2 p){
        return 0;
    }
    }
    
