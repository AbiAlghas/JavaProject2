public class RegistrationTester {
        public static void main(String[] args) {
            Registration r = new Registration("abi@yahoo.com", "Abi12345", "A123as");
            System.out.println("Email: " + r.getEmail());
            System.out.println("Username: " + r.getUsername());
            System.out.println("Password: " + r.getPassword());

        }}