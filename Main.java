import java.util.Arrays;
public class Main {
  public static double [][] copySquare(double [][] square){
    int size = square.length;

    double[][] sameArray = new double[size][size];
    for(int r = 0; r < size; r ++){
      for(int c = 0; c < size; c++){
        sameArray[r][c] = square[r][c];
      }
    }
    return sameArray;
  }


  public static double [][] copyRectangle(double [][] rectangle){
    int length = rectangle.length;
    int hight = rectangle[0].length;
    double [][] sameArray = new double[hight][length];
    for(int r = 0; r < hight; r ++){
      for(int c = 0; c < length; c ++){
        sameArray[r][c] = rectangle[r][c];
      }
    }
    return sameArray;
  }

  public static double [][] copyRagged(double [][] ragged){
    double [][] sameArray = new double[ragged.length][];
    for(int r = 0; r < ragged.length; r ++){
      sameArray[r] = new double[ragged[r].length];
      for(int c = 0; c < ragged[r].length;c++){
        sameArray[r][c] = ragged[r][c];
      }
    }
    
    return sameArray;
    
  }

  public static void printTranspose(double [][] reverse){
    int origRows = reverse.length;
    int origColls = reverse[0].length;
    double [][] reverseArray = new double [origColls][origRows];
    for(int c = 0; c < origColls; c ++){
      for(int r = 0; r < origRows; r ++){
        reverseArray[c][r] = reverse[r][c];
      }
    }
    for(int r = 0; r < origColls; r ++){
      for(int c = 0; c < origRows; c ++ ){
        System.out.print(reverse[c][r] + " ");
      }
      System.out.println();
    }
    
  }

  public static double [][] withWeightedAverage(double [][] grades, double[] weighted){
    int newRows = grades.length +1;
    int newColls = grades[0].length + 1;
    double average[][] = new double [newRows][newColls];
    double addColls = 0.0;
    double multRows = 0.0;
    for(int r = 0; r < newRows-1; r++){
      for(int c = 0; c < newColls; c++){
        if(newColls - 1 == c){
          average[r][c] = multRows;
          multRows = 0.0;
        }
        else{
        average[r][c] = grades[r][c];
        multRows = average[r][c] * weighted[c] + multRows;
        }
      }
      
    }

    for(int c = 0; c < newColls; c++){
      for(int r = 0; r < newRows; r++){
        if(newRows - 1 == r){
          average[newRows-1][c] = addColls/grades.length;
          addColls = 0.0;
        }
        else{
          addColls = average[r][c] + addColls;
        }
      }
    }
      return average;
    }




  public static void main(String[] args) {
    double[][] orig = new double[][]{
    {99, 85, 98},
    {98, 57, 79},
    {92, 77, 74},
    {94, 62, 81},
    {99, 94, 92},
    {80, 76.5, 67},
    {76, 58.5, 90.5},
    {92, 66, 91},
    {77, 70.5, 66.5},
    {89, 89.5, 81}
    };

    double [] orig2 = new double [] {0.25,0.25,0.5};
    
    double[][] newArr = withWeightedAverage(orig, orig2);
    System.out.println(Arrays.deepToString(newArr));
    //printTranspose(orig);
  }
}