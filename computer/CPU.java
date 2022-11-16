package computer;

import java.util.Scanner;

public class CPU {
  public static Scanner scanner = new Scanner(System.in);

  private String id;

  private String name;

  private float price;
  private Brand brand;

  public CPU() {
  }

  public CPU(String id, String name, Brand brand) {
    this.id = id;
    this.name = name;
    this.brand = brand;
  }

  public String getId() {
    return id;
  }

  public float getPrice() {
    return this.price;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void input() {
    System.out.println("Moi ban nhap id CPU: ");
    setId(scanner.nextLine());
    System.out.println("Moi ban nhap ten CPU: ");
    setName(scanner.nextLine());
    brand.input();

  }
}
