package schoolManagement;

import schoolManagement.enums.Subject;

public class Giaovien extends Nhansu {
  Subject subject;

  public Giaovien(String name, int age, String cCCD, int subject) {
    super(name, age, cCCD);

    this.subject = Subject.getSubject(subject);
  }

}
