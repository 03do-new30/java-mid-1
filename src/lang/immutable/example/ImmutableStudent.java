package lang.immutable.example;

public class ImmutableStudent {

    private final String name;
    private final String major;

    public ImmutableStudent(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public ImmutableStudent withMajor(String major) {
        return new ImmutableStudent(name, major);
    }

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
