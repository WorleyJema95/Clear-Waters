import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OceanConservation {
    public static void main(String[] args) {

        // Create a string containing 2000 lines of code
        String text = "";
        for (int i = 1; i <= 2000; i++) {
            text += "// Line " + i + ": A conservation organization that works to protect and preserve our oceans and marine life through education and activism.\n";
        }

        // Write the string to a file
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("ocean_conservation.txt"));
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}