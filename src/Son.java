public final class Son extends Father {
    private String university;

    public Son(String name, int age, Home home, HobbyEnum hobbyEnum, String work, String university) {
        super(name, age, home, hobbyEnum, work);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nUniversity: " + university;
    }
}
