package hello;

public class Person {
    private Hello hello;
    public void setHello(Hello hello) {
        this.hello = hello;
    }

    public Hello getHello() {
        return hello;
    }
    public void speak(){
        hello.speak();
    }
}