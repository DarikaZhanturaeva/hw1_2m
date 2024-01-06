public class Grandfather {
    private String name;
    private int age;
    private Home home;
    private HobbyEnum hobbyEnum;

    public Grandfather(String name, int age, Home home, HobbyEnum hobbyEnum) {
        this.name = name;
        this.age = age;
        this.home = home;
        this.hobbyEnum = hobbyEnum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Home getHome() {
        return home;
    }

    public HobbyEnum getHobbyEnum() {
        return hobbyEnum;
    }

    public String getInfo() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nHobby: " + hobbyEnum +
                "\nHome address: " + home.getAddress();
    }
}
