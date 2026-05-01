public class MyVector {
    private double[] elements; 
    static int count;  // インスタンス生成されたベクトルの総数 

    public MyVector(double x, double y) { 
        // ベクトル (x, y) に初期化する 
        // elements, countともに初期化すること．
        this.elements = new double[2];
        this.elements[0] = x;
        this.elements[1] = y;
        count++; 
    } 
    boolean isEqual(MyVector v) { 
        // ベクトル v と各成分が等しければ true, そうでなければ false を返す 
        if (this.elements[0] != v.elements[0]) return false;
        if (this.elements[1] != v.elements[1]) return false;
        return true;
    } 
    static int getNumVec( ) { 
        // インスタンス生成されたベクトルの総数を返す
        return count; 
    } 
    void print() { 
        // ベクトルの座標を (x, y) という形で表示する 
        System.out.println("("+ this.elements[0] + ", " + this.elements[1] + ")");
    }
}
