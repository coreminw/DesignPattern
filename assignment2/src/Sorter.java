import java.util.Date;

//import java.text.ParsePosition;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class Sorter {
//    private Comparable comparable;
//
//    public Sorter(Comparable compare) {
//        this.comparable = compare;
//    }
//
//    public void setComparable(Comparable compare) {
//        this.comparable = compare;
//    }
//
//    public void bubbleSort(Object[] objs) {
//        for (int i = 0; i < objs.length - 1; i++) {
//            for (int j = 0; j < objs.length - i - 1; j++) {
//                if (comparable.compareTo(objs[j], objs[j + 1]) > 0) { // swap
//                    Object temp = objs[j];
//                    objs[j] = objs[j + 1];
//                    objs[j + 1] = temp;
//                }
//            }
//        }
//    }
//}
public class Sorter{
    private Comparable comparable;

    public Sorter(Comparable comparable){
        this.comparable = comparable;
    }
    public void setComparable(Comparable comparable){

    }

    void bubbleSort(Object[] obj) {
        for (int i = 0; i < obj.length - 1; i++) {
            for (int j = 0; j < obj.length - i - 1; j++) {
                if (comparable.compareTo(obj[j], obj[j + 1]) > 0) { // swap
                    Object temp = obj[j];
                    obj[j] = obj[j + 1];
                    obj[j + 1] = temp;
                }
            }
        }
    }
}