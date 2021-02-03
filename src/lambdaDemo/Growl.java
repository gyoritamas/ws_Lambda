package lambdaDemo;

@FunctionalInterface
public interface Growl  {
  void growling(int a, String gr);

  default void anotherInterface(){
    System.out.println("Implemented by default interface");
  }

}

