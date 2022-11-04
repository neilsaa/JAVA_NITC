package student;

import java.util.Scanner;

public class Student {
  private String name;
  private String _class;
  private int age;
  private double math, literature, english, history;

  public Student(String name, String _class, int age, double math, double literature, double english, double history) {
    this.name = name;
    this._class = _class;
    this.age = age;
    this.math = math;
    this.literature = literature;
    this.english = english;
    this.history = history;

  }

  public Student() {

  }

  public double average() {

    return (this.english + this.history + this.literature + this.math) / 4;
  }

  public Student increasePoint() {
    this.math += 1;
    return this;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String get_class() {
    return _class;
  }

  public void set_class(String _class) {
    this._class = _class;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getMath() {
    return math;
  }

  public void setMath(double math) {
    this.math = math;
  }

  public double getLiterature() {
    return literature;
  }

  public void setLiterature(double literature) {
    this.literature = literature;
  }

  public double getEnglish() {
    return english;
  }

  public void setEnglish(double english) {
    this.english = english;
  }

  public double getHistory() {
    return history;
  }

  public void setHistory(double history) {
    this.history = history;
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap ten sinh vien: ");
    setName(scanner.nextLine());
    System.out.println("Nhap tuoi sinh vien: ");
    setAge(Integer.parseInt(scanner.nextLine()));
    System.out.println("Nhap lop sinh vien: ");

    set_class(scanner.nextLine());
    System.out.println("Nhap diem toan sinh vien: ");
    setMath(scanner.nextDouble());
    System.out.println("Nhap diem van sinh vien: ");
    setLiterature(scanner.nextDouble());
    System.out.println("Nhap diem tieng Anh sinh vien: ");
    setEnglish(scanner.nextDouble());
    System.out.println("Nhap diem lich su sinh vien: ");
    setHistory(scanner.nextDouble());

  }

  public void print() {
    System.out.println("Ten: " + this.getName() + "\n" + "Tuoi: " + this.getAge() + "\n" + "Lop: " + this.get_class()
        + "\n" + "Toan: " + this.getMath() + "\n" + "Van: " + this.getLiterature() + "\n" + "Tieng anh: "
        + this.getEnglish() + "\n" + "Lich su: " + this.getHistory() + "\n" + "Diem trung binh: " + this.average());
  }

}
