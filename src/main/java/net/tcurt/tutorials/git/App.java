package net.tcurt.tutorials.git;

/** Hello world! */
public class App {
  private final String defaultName;

  public App(String defaultName) {
    this.defaultName = defaultName;
  }

  public void display() {
    System.out.println("Hello, " + defaultName);
  }

  public static void main(String[] args) {
    App app = new App("Interactive Git Tutorial!");
    app.display();
  }
}
