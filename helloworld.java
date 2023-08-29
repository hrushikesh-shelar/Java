
class Hello {
  public static void main(String a[]) {
    // System.out.print("Hello World");

    String s1 = "Hrushikesh";
    String s2 = "Hrushikesh";
    String s3 = "Hrushikesh";
    System.out.print("Before\n");
    System.out.print(System.identityHashCode(s1) + "\n");
    System.out.print(System.identityHashCode(s2) + "\n");
    System.out.print(System.identityHashCode(s3) + "\n");
    s3 = s3 + "2";

    System.out.print("After\n");
    System.out.print(System.identityHashCode(s1) + "\n");
    System.out.print(System.identityHashCode(s2) + "\n");
    System.out.print(System.identityHashCode(s3) + "\n");

  }
}