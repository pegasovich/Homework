package OOP.HomeTask3.RLEjUnit;

public class TestRLE {


    public static void main(String[] args) {

        RLECompress rleCompressE = new RLECompress();
        String resultE = rleCompressE.encode("");
        System.out.println("Encoder, Output string is: "+resultE);

        RLECompress rleCompressD = new RLECompress();
        String resultD = rleCompressD.decode("");
        System.out.println("Decoder, Output string is: "+resultD);

    }
}
