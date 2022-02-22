import java.util.Map;
import java.util.HashMap;
public class WordProcessor {
    private String fileName;
    private ISpellChecker spellChecker;
    private Map<String, DocConverter> converters;

    public WordProcessor(String fileName){
        this.fileName = fileName;
        converters = new HashMap<String, DocConverter>();
    }
    public void addDocConverter(DocConverter converter){
        converters.put(converter.getExtension(), converter);
    }
    public void convertDocTo(String ext){
        if(converters.containsKey((ext))){
            DocConverter c = converters.get(ext);
            c.save(fileName);
        }
    }
    public void setSpellChecker(ISpellChecker spellChecker){
        this.spellChecker = spellChecker;
    }
    public void checkSpelling(){
        spellChecker.check();
    }

//    public WordProcessor(String fileName){
//        Converters=new HashMap<String, DocConverter>();
//        this.fileName=fileName;
//    }
//
//    public void addDocConverter(DocConverter converter){
//        Converters.put(converter.getExtension(), converter);
//    }
//
//    public void convertDocTo(String ext){
//        if(Converters.containsKey(ext)){
//            DocConverter c = Converters.get(ext);
//            c.save(fileName);
//        }
//    }
//
//    public void setSpellChecker(ISpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//    }
//    public void checkSpelling(){
//        if(spellChecker != null){
//            spellChecker.check();
//        }
//    }
}
