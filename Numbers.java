public class Numbers {
    

    public static void main(String[] args) throws Exception {
        System.out.println(getRectangleArea(4, 5));    
    }

    /**
     * Returns an area of a rectangle given by width and heigth.
     *
     * @param {numder} width
     * @param {number} height
     * @return {number}
     *
     * @example:
     *   5, 10 => 50
     *   5, 5  => 25
     */
    public static Integer getRectangleArea(Integer width, Integer height) {
        var s = width * height;
        return s;
    }

    /**
    * Returns a circumference of circle given by radius.
    *
    * @param {number} radius
    * @return {number}
    *
    * @example:
    *   5    => 31.41592653589793
    *   3.14 => 19.729201864543903
    *   0    => 0
    */
    public static Double getCicleCircumference(Double radius) {
        return 0.0;
    }

    /**
    * Returns an average of two given numbers.
    *
    * @param {numder} value1
    * @param {number} value2
    * @return {number}
    *
    * @example:
    *   5, 5  => 5
    *  10, 0  => 5
    *  -3, 3  => 0
    */
    public static Double getAverage(Double value1, Double value2) {
        return 0.0;
    }

    /**
    * Returns a distance beetween two points by cartesian coordinates.
    *
    * @param {number} x1
    * @param {number} y1
    * @param {number} x2
    * @param {number} y2
    *
    * @return {number}
    *
    * @example:
    *   (0,0) (0,1)    => 1
    *   (0,0) (1,0)    => 1
    *   (-5,0) (10,-10) => 18.027756377319946
    */
    public static Double getDistanceBetweenPoints(Integer x1, Integer y1, Integer x2, Integer y2) {
        return 0.0;
    }

    /**
    * Returns a root of linear equation a*x + b = 0 given by coefficients a and b.
    *
    * @param {number} a
    * @param {number} b
    * @return {number}
    *
    * @example:
    *   5*x - 10 = 0    => 2
    *   x + 8 = 0       => -8
    *   5*x = 0         => 0
    */
    public static Integer getLinearEquationRoot(Integer a, Integer b) {
        return 0;
    }

    /**
    * Returns an angle (in radians) between two vectors given by xi and yi, coordinates in Cartesian plane
    * See details https://en.wikipedia.org/wiki/Euclidean_vector#Representations
    *
    * @param {number} x1
    * @param {number} y1
    * @param {number} x2
    * @param {number} y2
    * @return {number}
    *
    * @example:
    *   (1,0) (0,1)     => π/2
    *   (0,1) (0,-1)    => π
    *   (0,-1) (1,0)    => π/2
    *   (0,1) (0,1)     => 0
    *   (0,1) (1,2)     => 0
    */
    public static Double getAngleBetweenVectors(Integer x1, Integer y1, Integer x2, Integer y2) {
        return 0.0;
    }

    /**
    * Returns a number by given string representation.
    *
    * @param {string} value
    * @return {number}
    *
    * @example:
    *    '100'     => 100
    *     '37'     => 37
    * '-525.5'     => -525.5
    */
    public static Double parseNumberFromString(String value) {
        return 0.0;
    }

    /**
    * Returns a diagonal length of the rectangular parallelepiped given by its sides a,b,c.
    *
    * @param {number} a
    * @param {number} b
    * @param {number} c
    * @return {number}
    *
    * @example:
    *   1,1,1   => 1.7320508075688772
    *   3,3,3   => 5.196152422706632
    *   1,2,3   => 3.741657386773941
    */
    public static Double getParallelipidedDiagonal(Integer a, Integer b, Integer c) {
        return 0.0;
    }

    /**
    * Returns the number rounded to specified power of 10.
    *
    * @param {number} num
    * @param {number} pow
    * @return {number}
    *
    * @example:
    *   1234, 0  => 1234
    *   1234, 1  => 1230
    *   1234, 2  => 1200
    *   1234, 3  => 1000
    *   1678, 0  => 1678
    *   1678, 1  => 1680
    *   1678, 2  => 1700
    *   1678, 3  => 2000
    */
    public static Double roundToPowerOfTen(Double num, Double pow) {
        return 0.0;
    }
}
