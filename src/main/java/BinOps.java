public class BinOps {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println(binOps.sum("11111010", "00000011"));
        System.out.println(binOps.mult("11111010", "00000011"));
    }

    public String sum(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2)
                + Integer.parseInt(b, 2));
    }

    public String mult(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2)
                * Integer.parseInt(b, 2));
    }
}