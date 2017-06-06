package ArrayCopier;


public class ArrayCopier {


  public int[] copy(int[] src, int[] dst) {

    if(src.length > dst.length) {
      for(int i = 0 ; i <= dst.length - 1 ; i ++){
        dst[i] = src[i];
      }
    }else if (src.length < dst.length) {
      for(int i = 0 ; i <= src.length -1; i ++) {
        dst[i] = src[i];
      }
      for(int i = src.length ; i <= dst.length-1 ; i++) {
        dst[i] = 0 ;
      }
    } else {
      for(int i = 0; i < src.length; i++){
        dst[i] = src[i];
      }
    }

    return dst;
  }


}
