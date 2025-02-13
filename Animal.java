abstract class Animal {
    protected int age;

    public Animal() {
        age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();
}
