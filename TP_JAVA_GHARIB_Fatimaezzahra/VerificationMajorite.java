public class VerificationMajorite {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        System.out.println("âge passé en argument : " + age);
        
        if (age >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }
    }
}
