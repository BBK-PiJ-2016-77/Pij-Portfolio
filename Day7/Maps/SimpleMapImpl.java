package Maps;


public class SimpleMapImpl implements SimpleMap{

  private String[] mapArray;

  public SimpleMapImpl() {
    mapArray = new String[10000];
  }


  @Override
  public void put(int key, String name) {
    if(mapArray[key] == null) {
      mapArray[key] = name;
    }
  }

  @Override
  public String get(int key) {
    return mapArray[key];
  }

  @Override
  public void remove(int key) {
    mapArray[key] = null;
  }

  @Override
  public boolean isEmpty() {
    int i = 0;
    while(i < mapArray.length) {

      i++;
      if (mapArray[i] !=null){ return  false;}

    }
    return true;
  }


}
