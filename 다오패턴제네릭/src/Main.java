public class Main {
    public static void main(String[] args) {
        PasswordInfo p;
        DAO<PasswordInfo,String> pdo = new PasswordDAOImpl("passwords");

        System.out.println("--- inserting...");
        p = new PasswordInfo("https://www.smu.ac.kr", "smu","abcde");
        pdo.insert(p);
        p = new PasswordInfo("https://www.smu2.ac.kr", "smu2","abcde");
        pdo.insert(p);

        System.out.println("--- finding all...");
        for (PasswordInfo pi : pdo.findAll()) {
            System.out.println("reading... " + pi);
        }

        System.out.println("--- updating...");
        p = pdo.findAll().get(1);
        p.setId("smu1");
        pdo.update(p.getKey(), p);

        System.out.println("--- see if updated...");
        p = pdo.findByKey("https://www.smu2.ac.kr");
        if (p != null) {
            System.out.println(p);
        }

        System.out.println("--- deleting...");
        pdo.deleteByKey("https://www.smu2.ac.kr");

        System.out.println("--- finding all after deleting...");
        for (PasswordInfo pi : pdo.findAll()) {
            System.out.println("reading... " + pi);
        }
    }
}
