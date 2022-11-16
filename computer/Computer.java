package computer;

import java.util.Scanner;

public class Computer {
  Scanner scanner = new Scanner(System.in);
  private CPU cpu;
  private Mainboard mainboard;

  private RAM ram;

  private Brand brand;

  private String name;

  private float price;

  public Computer(CPU cpu, Mainboard mainboard, RAM ram, Brand brand, String name) {
    this.cpu = cpu;
    this.mainboard = mainboard;
    this.ram = ram;
    this.brand = brand;
    this.name = name;
    this.price = cpu.getPrice() + ram.getPrice() + mainboard.getPrice();
  }

  public CPU getCpu() {
    return cpu;
  }

  public void setCpu(CPU cpu) {
    this.cpu = cpu;
  }

  public Mainboard getMainboard() {
    return mainboard;
  }

  public void setMainboard(Mainboard mainboard) {
    this.mainboard = mainboard;
  }

  public RAM getRam() {
    return ram;
  }

  public void setRam(RAM ram) {
    this.ram = ram;
  }

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void input() {
    System.out.println("Moi ban nhap ten may tinh: ");
    setName(scanner.nextLine());
    brand.input();
  }

  public float getPrice() {
    return this.price;
  }

}
