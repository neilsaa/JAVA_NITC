package schoolManagement.enums;

public enum Subject {
  TOAN(0), VAN(1), HOA(2), LY(3);

  public final int subject;

  private Subject(int i) {
    this.subject = i;
  }

  public static Subject getSubject(int i) {
    for (Subject s : Subject.values()) {
      if (s.subject == i) {
        return s;
      }

    }
    return null;
  }

}
