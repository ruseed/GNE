package gne.execute;

class JTBCException extends Exception {
  public JTBCException(String msg) {
    super(msg);
  }
  
  public JTBCException() {
    super("인형술 실패로 인해 태블릿PC가 발견되었습니다.");
  }
}
