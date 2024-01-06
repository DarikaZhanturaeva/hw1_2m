public class Father extends Grandfather {
    private String work;

    public Father(String name, int age, Home home, HobbyEnum hobbyEnum, String work) {
        super(name, age, home, hobbyEnum);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void goWork() {
        System.out.println("Идет на работу в 8 утра ");
    }

    public void goWork(String work) {
        System.out.println("Go work " + work);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nWork: " + work;
    }
}
