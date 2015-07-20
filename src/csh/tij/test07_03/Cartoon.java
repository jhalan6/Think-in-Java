package csh.tij.test07_03;

class Art {
  Art() { System.out.println("Art constructor"); }
}

class Drawing extends Art {
  Drawing() { System.out.println("Drawing constructor"); }
}

public class Cartoon extends Drawing {
  public static void main(String[] args) {
    new Cartoon();
  }
} 