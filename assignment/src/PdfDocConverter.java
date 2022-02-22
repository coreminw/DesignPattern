public class PdfDocConverter extends DocConverter{
    public PdfDocConverter() {
        super("pdf");
    }

    @Override
    public void save(String fileName){
        System.out.println("new doc.pdf로 변환해서 저장합니다");
    }
}
