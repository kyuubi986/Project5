import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZipCode {
    String postalCode;
        public ZipCode(String postalCode)
        {
            try{
                if(postalCode.length() == 5)
                {
                    this.postalCode = postalCode;
                }
            }catch(Exception iox){
                System.err.println("Input must be a valid zipcode");
            }


        }

    public static void main(String[] args) {
            ZipCode trying = new ZipCode("95652");
        System.out.println(new ServiceCommunicator("http://api.zippopotam.us/us/" + trying.postalCode).get());
    }
}
