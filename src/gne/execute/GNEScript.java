package gne.execute;

import java.util.*;

class GNEScript {
  private Map<Integer, String> data = new Map<Integer, String>();
  private int size = 0;
  
  private Map<Integer, String> buffer = new Map<Integer, String>();
  private int pointer = 0;
  
  public GNEScript(String code) {
    String[] list = code.split("\n");
    int i = 0;
    for(String m : list) {
      data.put(++i, m);
    }
    this.size = i;
    
    initialization();
  }
  
  public void initialization() {
  }
  
  public int getPointer() {
    return this.pointer;
  }
  
  public void setPointer(int pointer) throws JTBCException {
    if (pointer < 0 || pointer > size) {
      throw new JTBCException("조작한 값이 들킬 수 도 있는 범위입니다.");
    } else {
      this.pointer = pointer;
    }
  }
}
