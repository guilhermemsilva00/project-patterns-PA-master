class Main {
  public static void main(String[] args) {

    SingleObject s1 = SingleObject.getInstance();
    SingleObject s2 = SingleObject.getInstance();
    SingleObject s3 = SingleObject.getInstance();

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
  }
}