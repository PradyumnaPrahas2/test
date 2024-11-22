/*
Develop an OnlineShopping System where the user can browse products, add it to shopping cart and checkout.
1) Give a welcome Statement to User then display options Register,Login,Exit. User will choose    from the Options.
2) Register: Users should be able to create an account by providing basic information i.e name, email, and password.
-name should be less than 8 characters all in alphabets
-email should be @gmail.com or @yahoo.com
-password should be exactly 5 characters, combination of letters and digits.
-give a statement upon  successful registration 
3) login: ask for email, password 
   NOTE: the email and password should exactly match it is case sensitive
   - give a successful login statement
   Then app should display a list of available products.
4)Then user can see details of  name, description, price of all products.
  The user can add the product in his/her cart by giving product number if not, he/she can       
  checkout
5) Display total and total with gst separately
   Then print a statement to come back again.
   Then user can exit....

Add a Feature:
For adding more than 2000 priced product user should be asked again that its expensive does she/he still want to add it to cart? 
Ask this by raising an Exception and handle it by yes/no Answer from user
-user can choose yes or no
-if yes total bill with gst of 6.5% will be given including the expensive product also.
-if no the other products in the cart will be billed with 6.5% gst. Without including Expensive product

Sample Input and Output:
Welcome to the Online Shopping App!
1. Register
2. Login
3. Exit
Choose an option: 1
Enter username (less than 8 characters, alphabets only): ventateshyadav12
Invalid username. Must be less than 8 characters and contain only alphabets.
Welcome to the Online Shopping App!
1. Register
2. Login
3. Exit
Choose an option: 1
Enter username (less than 8 characters, alphabets only): venky
Enter email (@gmail.com or @yahoo.com only): venky@icloud.com
Invalid email. Must end with @gmail.com or @yahoo.com.
Welcome to the Online Shopping App!
1. Register
2. Login
3. Exit
Choose an option: 1
Enter username (less than 8 characters, alphabets only): venky
Enter email (@gmail.com or @yahoo.com only): venky@gmail.com
Create password (exactly 5 characters, combination of letters and digits): 123ab
User registered successfully!
Welcome to the Online Shopping App!
1. Register
2. Login
3. Exit
Choose an option: 2
Enter email: Venky@gmail.com
Enter password: 123ab
Invalid email or password. Please try again.
Welcome to the Online Shopping App!
1. Register
2. Login
3. Exit
Choose an option: 2
Enter email: venky@gmail.com
Enter password: 123AB
Invalid email or password. Please try again.
Welcome to the Online Shopping App!
1. Register
2. Login
3. Exit
Choose an option: 2
Enter email: venky@gmail.com
Enter password: 123ab
Login successful!
Products:
1. Product{name='Laptop', description='High performance laptop', price=1200.0}
2. Product{name='Smartphone', description='Latest model smartphone', price=800.0}
3. Product{name='Headphones', description='Noise cancelling headphones', price=200.0}
4. Product{name='Luxury Watch', description='Exclusive luxury watch', price=2500.0}
0. Checkout
Choose a product to add to cart (or 0 to checkout): 1
Product added to cart.
Products:
1. Product{name='Laptop', description='High performance laptop', price=1200.0}
2. Product{name='Smartphone', description='Latest model smartphone', price=800.0}
3. Product{name='Headphones', description='Noise cancelling headphones', price=200.0}
4. Product{name='Luxury Watch', description='Exclusive luxury watch', price=2500.0}
0. Checkout
Choose a product to add to cart (or 0 to checkout): 2
Product added to cart.
Products:
1. Product{name='Laptop', description='High performance laptop', price=1200.0}
2. Product{name='Smartphone', description='Latest model smartphone', price=800.0}
3. Product{name='Headphones', description='Noise cancelling headphones', price=200.0}
4. Product{name='Luxury Watch', description='Exclusive luxury watch', price=2500.0}
0. Checkout
Choose a product to add to cart (or 0 to checkout): 3
Product added to cart.
Products:
1. Product{name='Laptop', description='High performance laptop', price=1200.0}
2. Product{name='Smartphone', description='Latest model smartphone', price=800.0}
3. Product{name='Headphones', description='Noise cancelling headphones', price=200.0}
4. Product{name='Luxury Watch', description='Exclusive luxury watch', price=2500.0}
0. Checkout
Choose a product to add to cart (or 0 to checkout): 4
Product price exceeds 2000. Do you still want to add it to cart?
Do you still want to add this product to the cart? (yes/no): yes
Product added to cart.
Products:
1. Product{name='Laptop', description='High performance laptop', price=1200.0}
2. Product{name='Smartphone', description='Latest model smartphone', price=800.0}
3. Product{name='Headphones', description='Noise cancelling headphones', price=200.0}
4. Product{name='Luxury Watch', description='Exclusive luxury watch', price=2500.0}
0. Checkout
Choose a product to add to cart (or 0 to checkout): 6
Invalid choice. Please try again.
Products:
1. Product{name='Laptop', description='High performance laptop', price=1200.0}
2. Product{name='Smartphone', description='Latest model smartphone', price=800.0}
3. Product{name='Headphones', description='Noise cancelling headphones', price=200.0}
4. Product{name='Luxury Watch', description='Exclusive luxury watch', price=2500.0}
0. Checkout
Choose a product to add to cart (or 0 to checkout): 0
Shopping Cart:
Product{name='Laptop', description='High performance laptop', price=1200.0}
Product{name='Smartphone', description='Latest model smartphone', price=800.0}
Product{name='Headphones', description='Noise cancelling headphones', price=200.0}
Product{name='Luxury Watch', description='Exclusive luxury watch', price=2500.0}
Total: 4700.00
Total with GST (6.5%): 5005.50
Checking out...
Thank you, venky@gmail.com, for shopping with us!
Here's your receipt:
Shopping Cart:
Product{name='Laptop', description='High performance laptop', price=1200.0}
Product{name='Smartphone', description='Latest model smartphone', price=800.0}
Product{name='Headphones', description='Noise cancelling headphones', price=200.0}
Product{name='Luxury Watch', description='Exclusive luxury watch', price=2500.0}
Total: 4700.00
Total with GST (6.5%): 5005.50
Please come back soon!
Welcome to the Online Shopping App!
1. Register
2. Login
3. Exit
Choose an option: 3
Exiting the application.

*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

class Product {
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', description='" + description + "', price=" + price + "}";
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public double calculateTotalWithGST() {
        return calculateTotal() * 1.065;
    }

    public void showCart() {
        System.out.println("Shopping Cart:");
        for (Product item : items) {
            System.out.println(item);
        }
        System.out.printf("Total: %.2f\n", calculateTotal());
        System.out.printf("Total with GST (6.5%%): %.2f\n", calculateTotalWithGST());
    }
}

public class test3 {
    private static List<User> users = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Sample products
        products.add(new Product("Laptop", "High performance laptop", 1200.00));
        products.add(new Product("Smartphone", "Latest model smartphone", 800.00));
        products.add(new Product("Headphones", "Noise cancelling headphones", 200.00));
        products.add(new Product("Luxury Watch", "Exclusive luxury watch", 2500.00));

        while (true) {
            System.out.println("Welcome to the Online Shopping App!");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    User user = loginUser();
                    if (user != null) {
                        shopping(user);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the application.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void registerUser() {
        System.out.print("Enter username (less than 8 characters, alphabets only): ");
        String name = scanner.nextLine();
        if (!name.matches("[a-zA-Z]{1,7}")) {
            System.out.println("Invalid username. Must be less than 8 characters and contain only alphabets.");
            return;
        }

        System.out.print("Enter email (@gmail.com or @yahoo.com only): ");
        String email = scanner.nextLine();
        if (!email.endsWith("@gmail.com") && !email.endsWith("@yahoo.com")) {
            System.out.println("Invalid email. Must end with @gmail.com or @yahoo.com.");
            return;
        }

        System.out.print("Create password (exactly 5 characters, combination of letters and digits): ");
        String password = scanner.nextLine();
        if (password.matches("^(?=.[a-zA-Z])(?=.\\d).{5}$")) {
            System.out.println("Invalid password. Must be exactly 5 characters long and include a combination of letters and digits.");
            return;
        }
        

        users.add(new User(name, email, password));
        System.out.println("User registered successfully!");
    }

    private static User loginUser() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return user;
            }
        }
        System.out.println("Invalid email or password. Please try again.");
        return null;
    }

    private static void shopping(User user) {
        ShoppingCart cart = new ShoppingCart();
        while (true) {
            System.out.println("Products:");
            for (int i = 0; i < products.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, products.get(i));
            }
            System.out.println("0. Checkout");
            System.out.print("Choose a product to add to cart (or 0 to checkout): ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) {
                cart.showCart();
                performCheckout(user, cart);
                return;
            } else if (choice > 0 && choice <= products.size()) {
                Product product = products.get(choice - 1);
                cart.addProduct(product);
                System.out.println("Product added to cart.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void performCheckout(User user, ShoppingCart cart) {
        System.out.println("Checking out...");
        System.out.println("Thank you, " + user.getEmail() + ", for shopping with us!");
        System.out.println("Here's your receipt:");
        cart.showCart();
        System.out.println("Please come back soon!");
    }
}
 
}
