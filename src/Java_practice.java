import java.util.ArrayList;

public class Java_practice {
    public static void main(String[] args) {
        int va1 = 11;
        long va2 = 11L;
        double val3 = 11.0;
        char val4 = 'c';
        boolean val5 = true;
        boolean val6 = false;  //python -> Ture, False
        var tmp = 99;
        //String Class
        String str = "i am string";

        //Wrapper Class
        Integer val7 = 11;
        Long val8 = 22L;
        Double val9 = 11.9;
        Character val10 = 'c';
        Boolean val11 = Boolean.TRUE;
        Boolean val12 = Boolean.FALSE;

        //Collection = C++ STL
        //List 자료구조: 배열기반 리스트, 연결리스트
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        for(int i =0; i< arrayList.size();i++){
            System.out.print(arrayList.get(i) + ", "); //Integer + String = String
        }


    }
}

