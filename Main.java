import java.util.Arrays;
public class Main {
  public static double [][] copySquare(double [][] square){
    int size = 3;

    double[][] sameArray = new double[size][size];
    for(int r = 0; r < size; r ++){
      for(int c = 0; c < size; c++){
        sameArray[r][c] = square[r][c];
      }
    }
    return sameArray;
  }


  public static double [][] copyRectangle(double [][] rectangle){
    int length = 0;
    int hight = 0;
    double [][] sameArray = new double[hight][length]
  }


  public static void main(String[] args) {
    double[][] orig = new double[][]{{1,2,3},{4,5,6},{7,8,9}};
    double[][] newArr = copySquare(orig);
    System.out.println(Arrays.deepToString(newArr));
  }
}