package computer;

import java.util.Scanner;

public class RAM {
  Scanner scanner = new Scanner(System.in);
  private String id;

  private String name;

  private Brand brand;

  private float price;

  public RAM() {
  }

  public float getPrice() {
    return this.price;
  }

  public RAM(String id, String name, Brand brand) {
    this.id = id;
    this.name = name;
    this.brand = brand;
  }

  public String getId() {
    return id;
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
    System.out.println("Moi ban nhap id RAM: ");
    setId(scanner.nextLine());
    System.out.println("Moi ban nhap ten RAM: ");
    setName(scanner.nextLine());
    brand.input();

  }

}
