/*
Food Rating System
Design a food rating system that can perform the following operations:
1. Add the food items 
Food Item: (name, cuisine, price, rating)
ex: Enter name, cuisine, price, rating:
uthappa
indian
120
2.9
2. Edit Food Item with food item name 
ex: Enter existing name:
uthappa
Enter new name, cuisine, price, rating:
uthappa
indian
110
4
3. Delete Food Item with food item name
ex: Enter name:
uthappa
4. Modify Rating
ex: Enter name and new rating:
idli
3.2
Add feature:5. Increase Price for High Rated Items
ex: 
Before:
uthappa 120.0 2.9
manchuria 130.0 3.4
After:
uthappa 120.0 2.9
manchuria 149.5 3.4
Add feature 6. Get Highest Rated Food Item for Cuisine
ex:
Enter cuisine:
thai
Highest rated food item: manchuria 149.5 3.4
7. List All Food Items
8. Exit with the following print statement.
ex: Exiting the program. Goodbye!

Sample input and output:

1. Add Food Item
2. Edit Food Item
3. Delete Food Item
4. Modify Rating
5. Increase Price for High Rated Items
6. Get Highest Rated Food Item for Cuisine
7. List All Food Items
8. Exit
Select the choice from the above options: 1
Enter name, cuisine, price, rating:
idli
indian
100
3.2
1. Add Food Item
2. Edit Food Item
3. Delete Food Item
4. Modify Rating
5. Increase Price for High Rated Items
6. Get Highest Rated Food Item for Cuisine
7. List All Food Items
8. Exit
Select the choice from the above options: 1
Enter name, cuisine, price, rating:
vada
indian
120
2
1. Add Food Item
2. Edit Food Item
3. Delete Food Item
4. Modify Rating
5. Increase Price for High Rated Items
6. Get Highest Rated Food Item for Cuisine
7. List All Food Items
8. Exit
Select the choice from the above options: 5
Before:
idli 100.0
vada 120.0
After:
idli 114.99999999999999 3.2
vada 120.0 2.0
1. Add Food Item
2. Edit Food Item
3. Delete Food Item
4. Modify Rating
5. Increase Price for High Rated Items
6. Get Highest Rated Food Item for Cuisine
7. List All Food Items
8. Exit
Select the choice from the above options: 6
Enter cuisine:
indian
Highest rated food item: idli 114.99999999999999 3.2
1. Add Food Item
2. Edit Food Item
3. Delete Food Item
4. Modify Rating
5. Increase Price for High Rated Items
6. Get Highest Rated Food Item for Cuisine
7. List All Food Items
8. Exit
Select the choice from the above options: 7
idli 114.99999999999999 3.2
vada 120.0 2.0
1. Add Food Item
2. Edit Food Item
3. Delete Food Item
4. Modify Rating
5. Increase Price for High Rated Items
6. Get Highest Rated Food Item for Cuisine
7. List All Food Items
8. Exit
Select the choice from the above options: 4
Enter name and new rating:
vada
3.5
1. Add Food Item
2. Edit Food Item
3. Delete Food Item
4. Modify Rating
5. Increase Price for High Rated Items
6. Get Highest Rated Food Item for Cuisine
7. List All Food Items
8. Exit
Select the choice from the above options: 7
idli 114.99999999999999 3.2
vada 120.0 3.5
1. Add Food Item
2. Edit Food Item
3. Delete Food Item
4. Modify Rating
5. Increase Price for High Rated Items
6. Get Highest Rated Food Item for Cuisine
7. List All Food Items
8. Exit
Select the choice from the above options: 2
Enter existing name:
vada
Enter new name, cuisine, price, rating:
vada
indian
110
4
1. Add Food Item
2. Edit Food Item
3. Delete Food Item
4. Modify Rating
5. Increase Price for High Rated Items
6. Get Highest Rated Food Item for Cuisine
7. List All Food Items
8. Exit
Select the choice from the above options: 7
idli 114.99999999999999 3.2
vada 110.0 4.0
1. Add Food Item
2. Edit Food Item
3. Delete Food Item
4. Modify Rating
5. Increase Price for High Rated Items
6. Get Highest Rated Food Item for Cuisine
7. List All Food Items
8. Exit
Select the choice from the above options: 3
Enter name:
vada
1. Add Food Item
2. Edit Food Item
3. Delete Food Item
4. Modify Rating
5. Increase Price for High Rated Items
6. Get Highest Rated Food Item for Cuisine
7. List All Food Items
8. Exit
Select the choice from the above options: 7
idli 114.99999999999999 3.2
1. Add Food Item
2. Edit Food Item
3. Delete Food Item
4. Modify Rating
5. Increase Price for High Rated Items
6. Get Highest Rated Food Item for Cuisine
7. List All Food Items
8. Exit
Select the choice from the above options: 8
Exiting the program. Goodbye!

*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FoodItem {
private int id;
private String name;
private String cuisine;
private double rating;

public FoodItem(int id, String name, String cuisine, double rating) {
        this.id = id;
        this.name = name;
this.cuisine = cuisine;
this.rating = rating;
    }

public int getId() {
return id;
    }

public String getName() {
return name;
    }

public String getCuisine() {
return cuisine;
    }

public double getRating() {
return rating;
    }

public void updateRating(double newRating) {
this.rating = newRating;
    }

public void setName(String name) {
        this.name = name;
    }

public void setCuisine(String cuisine) {
this.cuisine = cuisine;
    }

public void setRating(double rating) {
this.rating = rating;
    }

    @Override
public String toString() {
return name + " (" + cuisine + "): " + rating;
    }
}

class Manager {
private List<FoodItem>foodItems;

public Manager() {
foodItems = new ArrayList<>();
    }

public void addFoodItem(int id, String name, String cuisine, double rating) {
FoodItem newItem = new FoodItem(id, name, cuisine, rating);
foodItems.add(newItem);
    }

public void editFoodItem(int id, String name, String cuisine, double rating) {
for (FoodItem item : foodItems) {
if (item.getId() == id) {
item.setName(name);
item.setCuisine(cuisine);
item.setRating(rating);
break;
            }
        }
    }

public void deleteFoodItem(int id) {
foodItems.removeIf(item ->item.getId() == id);
    }

public void modifyRating(int id, double newRating) {
for (FoodItem item : foodItems) {
if (item.getId() == id) {
item.updateRating(newRating);
break;
            }
        }
    }

public List<FoodItem>getFoodItems() {
return foodItems;
    }
}

class User {
public void getAllFoodItems(Manager manager) {
for (FoodItem item : manager.getFoodItems()) {
System.out.println(item);
        }
    }

public void getHighestRatedFoodItem(Manager manager, String cuisine) {
FoodItemhighestRated = null;
for (FoodItem item : manager.getFoodItems()) {
if (item.getCuisine().equalsIgnoreCase(cuisine)) {
if (highestRated == null || item.getRating() >highestRated.getRating()) {
highestRated = item;
                }
            }
        }
if (highestRated != null) {
System.out.println("Highest rated " + cuisine + " food item is " + highestRated.getName() + " with rating " + highestRated.getRating());
        } else {
System.out.println("No food items found for cuisine " + cuisine);
        }
    }
}

public class Test {
public static void main(String[] args) {
        Manager manager = new Manager();
        User user = new User();
        Scanner scanner = new Scanner(System.in);

while (true) {
System.out.println("Menu:");
System.out.println("1. Add Food Item");
System.out.println("2. Edit Food Item");
System.out.println("3. Delete Food Item");
System.out.println("4. Modify Food Item Rating");
System.out.println("5. List All Food Items");
System.out.println("6. Get Highest Rated Food Item for a Cuisine");
System.out.println("7. Exit");

System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
scanner.nextLine();  // Consume newline

if (choice == 1) {
System.out.print("Enter food item id: ");
int id = scanner.nextInt();
scanner.nextLine();  // Consume newline
System.out.print("Enter food item name: ");
                String name = scanner.nextLine();
System.out.print("Enter cuisine type: ");
                String cuisine = scanner.nextLine();
System.out.print("Enter rating: ");
double rating = scanner.nextDouble();
manager.addFoodItem(id, name, cuisine, rating);
            } else if (choice == 2) {
System.out.print("Enter food item id: ");
int id = scanner.nextInt();
scanner.nextLine();  // Consume newline
System.out.print("Enter new food item name: ");
                String name = scanner.nextLine();
System.out.print("Enter new cuisine type: ");
                String cuisine = scanner.nextLine();
System.out.print("Enter new rating: ");
double rating = scanner.nextDouble();
manager.editFoodItem(id, name, cuisine, rating);
            } else if (choice == 3) {
System.out.print("Enter food item id to delete: ");
int id = scanner.nextInt();
manager.deleteFoodItem(id);
            } else if (choice == 4) {
System.out.print("Enter food item id: ");
int id = scanner.nextInt();
System.out.print("Enter new rating: ");
doublenewRating = scanner.nextDouble();
manager.modifyRating(id, newRating);
            } else if (choice == 5) {
user.getAllFoodItems(manager);
            } else if (choice == 6) {
System.out.print("Enter cuisine type: ");
                String cuisine = scanner.nextLine();
user.getHighestRatedFoodItem(manager, cuisine);
            } else if (choice == 7) {
break;
            } else {
System.out.println("Invalid choice! Please try again.");
            }
        }

scanner.close();
    }
}







