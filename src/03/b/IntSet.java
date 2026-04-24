public class IntSet {
    int[] array; /*集合の要素を入れるための配列*/
    int num;     /* 要素の個数 */
    public void init() {   /* 集合を初期化するためのメソッド */
        array = new int[4];
        num = 0;
    }
    public void add(int v) { /* 集合に要素を追加するメソッド */
        for (int i=0; i < num; i++) {
            if (v == array[i]) return;
        }
        if (num < 4) array[num++] = v;
    }
    public boolean find(int v){ /* 集合に要素があるか調べるメソッド */
        for (int i = 0; i < num; i++)
        if (array[i] == v) return true;
        return false;
    }
    public int count(){
        return num;
    }
    public void remove(int v) {
        int i = 0;
        for (; array[i] != v; i++) {}
        for (; i + 1 < num; i++) {
            array[i] = array[i+1];
        }
        num--;     
    }
    public int getIndex(int v) {
        for (int i = 0; i < num; i++) {
            if (array[i] == v) return i;
        }
        return -1;
    }

}

