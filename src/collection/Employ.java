package collection;

public class Employ {
    private String name;
    private int age;
    private int depnum;

    public Employ(String name,int age,int depnum) {
        this.name = name;
        this.age=age;
        this.depnum=depnum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDepnum() {
        return depnum;
    }

    public void setDepnum(int depnum) {
        this.depnum = depnum;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", depnum=" + depnum +
                '}';
    }
}
