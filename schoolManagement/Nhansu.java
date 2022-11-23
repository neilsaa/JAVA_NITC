package schoolManagement;

/**
 * Nhansu
 */
public class Nhansu {

  private String name;
  private int age;
  private String CCCD;

  public Nhansu(String name, int age, String cCCD) {
    this.name = name;
    this.age = age;
    CCCD = cCCD;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCCCD() {
    return CCCD;
  }

  public void setCCCD(String cCCD) {
    CCCD = cCCD;
  }

}