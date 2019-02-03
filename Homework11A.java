import java.util.ArrayList;

public class Homework11A extends Homework11 {

  private ArrayList<Integer> arra;

    public Homework11A(){
      arra = new ArrayList<Integer>();
    }
    public int problem4() {
      int s = 0;
      for (int i : arr){
        s += i;
      }
      return s;
    }

    public void problem2(int n){
      int c = 0;
      while(c<arr.size()){
          int num = arr.get(c);
            if ((n % num) != 0){
              arr.remove(c);
            }else{
              c+=1;
            }
      }
    }
}
