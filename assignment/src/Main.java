public class Main {
    public static void main(String[] args) {

        WordProcessor wp = new WordProcessor("new doc");
        wp.addDocConverter(new DocxDocConverter());
        wp.addDocConverter(new PdfDocConverter());
        wp.addDocConverter(new OdtDocConverter());
        wp.setSpellChecker(new EngSpellChecker());
        wp.checkSpelling();
        wp.convertDocTo("odt");
        wp.convertDocTo("pdf");
        wp.convertDocTo("docx");
        wp.convertDocTo("wps");

    }
}
