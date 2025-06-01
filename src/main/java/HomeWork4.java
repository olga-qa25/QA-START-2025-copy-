/*TODO: перевірити чи мейл my.home.mail@gmail.com підпадає під правила:
    - закінчується на gmail.com
    - не містить більше одного символу @
    * - замінити всі крапки на _ окрім останньої

 */
//...

public class HomeWork4 {

    public static void main(String[] args) {
        String email = "my.home.mail@gmail.com";

        if (email.endsWith("gmail.com")) {
            System.out.println("my.home.mail@gmail.com contains @" + ";");
        }

//      System.out.println(email.indexOf("@") == email.lastIndexOf("@"));
        int count = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                System.out.println("contains no more than one @;");
                count++;
            }
        }
        String repeat = "my.home.mail@gmail.com";
        String repeatChange = repeat.replace(".", "_");
        System.out.println(repeatChange); // як замінити без останньої - не розумію
    }
}
