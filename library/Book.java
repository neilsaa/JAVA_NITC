package library;

import java.util.*;

public class Book {
  public static Scanner scanner = new Scanner(System.in);
  private String name;
  private int slg = 0;
  private ArrayList<String> status;

  public Book(String name, int slg, ArrayList<String> status) {
    this.name = name;
    this.slg = slg;
    this.status = status;
  }

  public void nhap() {
    System.out.println("Moi nhap ten sach: ");
    this.setName(scanner.nextLine());
    System.out.println("Moi nhap so luong sach:");
    this.setSlg(scanner.nextInt());
    for (int i = 0; i < slg; i++) {
      System.out.println("Moi nhap trang thai quyen sach thu " + i + ": ");
      status.add(scanner.nextLine());

    }
  }

  public void in() {
    System.out.println("Ten sach la: " + name);
    System.out.println("So luong sach la: " + slg);

  }

  public void lend() {
    for (int i = 0; i < slg; i++) {
      if (status.get(i) == "available") {
        status.set(i, "unavailable");
      }
    }
    slg -= 1;
  }

  public void xuatkho() {
    for (int i = 0; i < slg; i++) {
      if (status.get(i) == "stored") {
        status.set(i, "available");
      }
    }
    slg += 1;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSlg() {
    return slg;
  }

  public void setSlg(int slg) {
    this.slg = slg;
  }

  public ArrayList<String> getStatus() {
    return status;
  }

  public void setStatus(ArrayList<String> status) {
    this.status = status;
  }

}
