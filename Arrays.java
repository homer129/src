import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) throws Exception {
        /*ArrayList<String> list = new ArrayList<>();
       
        list.add("aaaa");
        list.add("bbbb");
        list.add("cc");
        list.add("d");
        list.add("eeeee");
        list.add("fff");*/

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        ArrayList<Integer> arr4 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arr6 = new ArrayList<ArrayList<Integer>>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr2.add(6);
        arr2.add(7);
        arr2.add(8);
        arr2.add(9);
        arr2.add(10);
        arr3.add(11);
        arr3.add(12);
        arr3.add(13);
        arr3.add(14);
        arr3.add(15);
        arr4.add(16);
        arr4.add(17);
        arr4.add(18);
        arr4.add(19);
        arr4.add(20);
        arr6.add(arr1);
        arr6.add(arr2);
        arr6.add(arr3);
        arr6.add(arr4);


        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(-6);
        list.add(7);
        list.add(7);*/
                
        System.out.println(toCsvText(arr6));
    }

    /**
     * Returns an index of the specified element in array or -1 if element is not found
     *
     * @param {array} arr
     * @param {any} value
     * @return {number}
     *
     * @example
     *    ['Ace', 10, true], 10    => 1
     *    ['Array', 'Number', 'string'], 'Date'    => -1
     *    [0, 1, 2, 3, 4, 5], 5    => 5
     */
    public static Integer findElement(List<String> arr, String value) {
        return arr.indexOf(value);
    }

    /**
    * Generates an array of odd numbers of the specified length
    *
    * @param {number} len
    * @return {array}
    *
    * @example
    *    1 => [ 1 ]
    *    2 => [ 1, 3 ]
    *    5 => [ 1, 3, 5, 7, 9 ]
    */
    public static ArrayList<Integer> generateOdds(Integer len) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (var i = 0; i < len - 1; i++) {
            list.add(list.get(i) + 2);
        }
        return list;
    }
    
    /**
    * Returns the doubled array - elements of the specified array are repeated twice using original order
    *
    * @param {array} arr
    * @return {array}
    *
    * @example
    *    ['Ace', 10, true]  => ['Ace', 10, true,   'Ace', 10, true]
    *    [0, 1, 2, 3, 4, 5] => [0, 1, 2, 3, 4, 5,   0, 1, 2, 3, 4, 5]
    *    [] => []
    */
    public static List<Object> doubleArray(List<Object> arr) {
        arr.addAll(arr);
        return arr;
    }

    /**
    * Returns an array of positive numbers from the specified array in original order
    *
    * @param {array} arr
    * @return {array}
    *
    * @example
    *    [ 0, 1, 2, 3, 4, 5 ] => [ 1, 2, 3, 4, 5 ]
    *    [-1, 2, -5, -4, 0] => [ 2 ]
    *    [] => []
    */
    public static List<Integer> getArrayOfPositives(List<Integer> arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();     
        for (var i = 0; i < arr.size(); i++) {
            var a = arr.get(i);
            if (a > 0) {
                arr1.add(a);
            }
        }
        return arr1;
    }

    /**
    * Returns the array of useprcase strings from the specified array
    *
    * @param {array} arr
    * @return {array}
    *
    * @example
    *    [ 'permanent-internship', 'glutinous-shriek', 'multiplicative-elevation' ] => [ 'PERMANENT-INTERNSHIP', 'GLUTINOUS-SHRIEK', 'MULTIPLICATIVE-ELEVATION' ]
    *    [ 'a', 'b', 'c', 'd', 'e', 'f', 'g' ]  => [ 'A', 'B', 'C', 'D', 'E', 'F', 'G' ]
    */
    public static List<String> getUpperCaseStrings(List<String> arr) {
        ArrayList<String> arr1 = new ArrayList<>();
        var a = arr.size();
        for (var i = 0; i < a; i++) {
            String b = arr.get(i);
            String c = b.toUpperCase();
            arr1.add(c);
        }
        return arr1;
    }

    /**
    * Returns the array of string lengths from the specified string array.
    *
    * @param {array} arr
    * @return {array}
    *
    * @example
    *    [ '', 'a', 'bc', 'def', 'ghij' ]  => [ 0, 1, 2, 3, 4 ]
    *    [ 'angular', 'react', 'ember' ] => [ 7, 5, 5 ]
    */
    public static List<Integer> getStringsLength(List<String> arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (var i = 0; i < arr.size(); i++) {
            var a = arr.get(i);
            arr1.add(a.length());
        }
        return arr1;
    }

    /**
    * Inserts the item into specified array at specified index
    *
    * @param {array} arr
    * @param {any} item
    * @param {number} index
    *
    * @example
    *    [ 0, 1, 3], 2, 2  => [ 0, 1, 2, 3 ]
    *    [ 0, 0, 1, 3, 5], 2, 3  => [ 0, 0, 1, 2, 3, 5 ]
    */
    public static List<Integer> insertItem(List<Integer> arr, Integer item, Integer index) {
        arr.add(index, item);
        return arr;
    }

    /**
    * Returns the n first items of the specified array
    *
    * @param {array} arr
    * @param {number} n
    *
    * @example
    *    [ 1, 3, 4, 5 ], 2  => [ 1, 3 ]
    *    [ 1, 3, 3, 3, 5 ], 4  => [ 1, 3, 3, 3 ]
    */
    public static List<Integer> getHead(List<Integer> arr, Integer n) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (var i = arr.size() - 1; arr2.size() <= n; i--) {
            arr2.add(0, arr.get(i));
        }
        return arr2;
    }
        /*ArrayList<Integer> arr1 = new ArrayList<>();
        for (var i = 0; i < n; i++) {
            arr1.add(arr.get(i));
        }
        return arr1;*/
    
    /**
    * Returns the n last items of the specified array
    *
    * @param {array} arr
    * @param {number} n
    *
    * @example
    *    [ 1, 3, 4, 5 ], 2  => [ 4, 5 ]
    *    [ 1, 3, 3, 3, 5 ], 4  => [ 3, 3, 3, 5 ]
    */
    public static List<Integer> getTail(List<Integer> arr, Integer n) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (var i = arr.size() - 1; arr2.size() + 1 <= n; i--) {
            arr2.add(0, arr.get(i));
        }
        return arr2;
    }

    /**
    * Returns CSV represebtation of two-dimentional numeric array.
    * https://en.wikipedia.org/wiki/Comma-separated_values
    *
    * @param {array} arr
    * @return {string}
    *
    * @example
    *    [
    *       [  0, 1, 2, 3, 4 ],
    *       [ 10,11,12,13,14 ],
    *       [ 20,21,22,23,24 ],
    *       [ 30,31,32,33,34 ]
    *    ]
    *           =>
    *     '0,1,2,3,4\n'
    *    +'10,11,12,13,14\n'
    *    +'20,21,22,23,24\n'
    *    +'30,31,32,33,34'
    */
    public static String toCsvText(ArrayList<ArrayList<Integer>> arr) {
        String str = "";
        String str1 = "";
        for (var i = 0; i < arr.size(); i++){
            str += arr.get(i).toString() + "\n";
        }
        for (var j = 0; j < str.length(); j++){
            if (str.charAt(j) == '[' || str.charAt(j) == ']' || str.charAt(j) == ' ') {
                str1 += "";
            } else {
                str1 += str.charAt(j);
            }
        }
        return str1;
    }

    /**
    * Transforms the numeric array into the according array of squares:
    *   f(x) = x * x
    *
    * @param {array} arr
    * @return {array}
    *
    * @example
    *   [ 0, 1, 2, 3, 4, 5 ] => [ 0, 1, 4, 9, 16, 25 ]
    *   [ 10, 100, -1 ]      => [ 100, 10000, 1 ]
    */
    public static List<Integer> toArrayOfSquares(List<Integer> arr) {
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (var i = 0; i < arr.size(); i++) {
            int a = arr.get(i);
            int b = (int)Math.pow(a, 2);
            arr3.add(b);
        }
        return arr3;
    }

    /**
    * Transforms the numeric array to the according moving sum array:
    *     f[n] = x[0] + x[1] + x[2] +...+ x[n]
    *  or f[n] = f[n-1] + x[n]
    *
    * @param {array} arr
    * @return {array}
    *
    * Example :
    *   [ 1, 1, 1, 1, 1 ]        => [ 1, 2, 3, 4, 5 ]
    *   [ 10, -10, 10, -10, 10 ] => [ 10, 0, 10, 0, 10 ]
    *   [ 0, 0, 0, 0, 0]         => [ 0, 0, 0, 0, 0]
    *   [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ] => [ 1, 3, 6, 10, 15, 21, 28, 36, 45, 55 ]
    */
    public static List<Integer> getMovingSum(List<Integer> arr) {/////////!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        ArrayList<Integer> arr4 = new ArrayList<>();
        arr4.add(arr.get(0));
        for (var i = 1; i < arr.size(); i++) {
            var a = arr.get(i) + arr4.get(i-1);
            arr4.add(a);
        }
        return arr4;
    }

    /**
    * Returns every second item from the specified array:
    *
    * @param {array} arr
    * @return {array}
    *
    * Example :
    * [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ] => [ 2, 4, 6, 8, 10 ]
    * [ 5, 4, 5, 4 ] => [ 4, 4 ]
    */
    public static List<Integer> getSecondItems(List<Integer> arr) {
        ArrayList<Integer> arr5 = new ArrayList<>();
        for (var i = 1; i < arr.size(); i+=2) {
            arr5.add(arr.get(i));            
        }
        return arr5;
    }

    /**
    * Propagates every item in sequence its position times
    * Returns an array that consists of: one first item, two second items, tree third items etc.
    *
    * @param {array} arr
    * @return {array}
    *
    * @example :
    *  [] => []
    *  [ 1 ] => [ 1 ]
    *  [ 1,2,3,4,5 ] => [ 1, 2,2, 3,3,3, 4,4,4,4, 5,5,5,5,5 ]
    *  [ 3, 4, 5 ] => [ 3, 4,4, 5,5,5 ]
    */
    public static List<Integer> propagateItemsByPositionIndex(List<Integer> arr) {
        return new ArrayList<Integer>();
    }

    /**
    * Returns array containing only unique values from the specified array.
    *
    * @param {array} arr
    * @return {array}
    *
    * @example
    *   [ 1, 2, 3, 3, 2, 1 ] => [ 1, 2, 3 ]
    *   [ 1, 1, 2, 2, 3, 3, 4, 4] => [ 1, 2, 3, 4]
    */
    public static List<Integer> distinct(List<Integer> arr) {
        ArrayList<Integer> arr7 = new ArrayList<>();
        for (var i = 0; i < arr.size(); i++) {
            for (var j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    arr7.add(arr.get(i));
                }
            }
        }
        return arr7;
    }
    
}