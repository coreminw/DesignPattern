import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;

public class LoadHudDisplays implements LoadDisplayInterface{
    String filename;

    LoadHudDisplays(String filename){
        this.filename= filename;
    }
    @Override
    public ArrayList<String> load(){
        try {
            ArrayList<String> list = new ArrayList<String>();
            BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));

            for (String str = read.readLine(); str != null; str = read.readLine())
                list.add(str);

            return list;
        } catch (Exception excp) {
            excp.printStackTrace();
        }
        return null;
    }
}
