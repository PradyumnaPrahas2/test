/*
Develop an Online Forum System that provide users a platform for discussing various topics, sharing knowledge,
and interacting with others in a structured online community.

1. Statement to User as "Welcome to Online Forum!".
2. Display 3 options 
   1.Register 
   2.Login 
   3.Exit
3. User Registration :
   Here User should give his/her username and bio.
   If any other user is creating profile with already existing username, then raise a statement that the Username is already existing so change that and register again with a unique           username. Upon finishing give a successful registration statement.
4. Login : 
   Give username 
   If user is not created display as user not found 
   If created then ok show options
   1.edit Profile 2.browse forums 3.create forums 4.view my posts 5.add post 6.logout
5. Edit profile: Give a new bio then, print profile updated statement.
6. Browse forums: If nothing then available then display no forums  available
                  If present show the forum name and description.
7. Create forum: Give forum name and description then give print  statement on successful creation of forum.
8. ADD post:  Select to which forum to add 
              Then select to which thread to add 
              If no thread present,give an option to Create a new thread by thread title.
              Then post the content.
              Give print statement on successful post creation in threadtitle  of forumname. 
9. logout
10.Exit

Add a Feature:
View posts: Display all the posts of the user.
If there are no posts, print a statement "no posts found for this user".
            If present display as -posts by username,-forum,-thread,-post

Sample Input and Output:
Welcome to Online Forum!
1. Register
2. Login
3. Exit
1
Enter username: dora
Enter bio: i am dora
User registered successfully.
Welcome to Online Forum!
1. Register
2. Login
3. Exit
4
Invalid choice. Try again.
Welcome to Online Forum!
1. Register
2. Login
3. Exit
1
Enter username: dora
Enter bio: hey i am doraSweety
Username already exists. Give a Unique Username
Welcome to Online Forum!
1. Register
2. Login
3. Exit
2
Enter username: venku
User not found.
Welcome to Online Forum!
1. Register
2. Login
3. Exit
2
Enter username: dora
1. Edit Profile
2. Browse Forums
3. Create Forum
4. View My Posts
5. Add Post
6. Logout
1
Enter new bio: i am dora the explorer
Profile updated.
1. Edit Profile
2. Browse Forums
3. Create Forum
4. View My Posts
5. Add Post
6. Logout
2
No forums available.
1. Edit Profile
2. Browse Forums
3. Create Forum
4. View My Posts
5. Add Post
6. Logout
3
Enter forum name: Travel
Enter forum description: To travel is to live
Forum created successfully.
1. Edit Profile
2. Browse Forums
3. Create Forum
4. View My Posts
5. Add Post
6. Logout
2
Forum: Travel
Description: To travel is to live
1. Edit Profile
2. Browse Forums
3. Create Forum
4. View My Posts
5. Add Post
6. Logout
4
Posts by dora:
No posts found for this user.
1. Edit Profile
2. Browse Forums
3. Create Forum
4. View My Posts
5. Add Post
6. Logout
5
Select a forum to add post:
1. Travel
1
Select a thread or create a new one:
1. Create New Thread
1
Enter thread title: my travel story
Enter post content: will you believe how many places i visited check out "ht
tp://dora.com"
Post created successfully in thread my travel story of forum Travel
1. Edit Profile
2. Browse Forums
3. Create Forum
4. View My Posts
5. Add Post
6. Logout
4
Posts by dora:
Forum: Travel
Thread: my travel story
Post: will you believe how many places i visited check out "http://dora.com"

1. Edit Profile
2. Browse Forums
3. Create Forum
4. View My Posts
5. Add Post
6. Logout
6
Welcome to Online Forum!
1. Register
2. Login
3. Exit
3
*/
import java.util.*;

public class test2 {
    private static Scanner scanner = new Scanner(System.in);
    private static ForumManager forumManager = new ForumManager();
    private static UserManager userManager = new UserManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to Online Forum!");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void registerUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter bio: ");
        String bio = scanner.nextLine();
        userManager.registerUser(username, bio);
    }

    private static void loginUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        User user = userManager.getUser(username);
        if (user != null) {
            showUserMenu(user);
        } else {
            System.out.println("User not found.");
        }
    }

    private static void showUserMenu(User user) {
        while (true) {
            System.out.println("1. Edit Profile");
            System.out.println("2. Browse Forums");
            System.out.println("3. Create Forum");
            System.out.println("4. Add Post");
            System.out.println("5. Logout");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    editProfile(user);
                    break;
                case 2:
                    browseForums(user);
                    break;
                case 3:
                    createForum(user);
                    break;
                case 4:
                    addPost(user);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void editProfile(User user) {
        System.out.print("Enter new bio: ");
        String newBio = scanner.nextLine();
        user.setBio(newBio);
        System.out.println("Profile updated.");
    }

    private static void browseForums(User user) {
        List<Forum> forums = forumManager.getForums();
        if (forums.isEmpty()) {
            System.out.println("No forums available.");
        } else {
            for (Forum forum : forums) {
                System.out.println("Forum: " + forum.getName());
                System.out.println("Description: " + forum.getDescription());
            }
        }
    }

    private static void createForum(User user) {
        System.out.print("Enter forum name: ");
        String name = scanner.nextLine();
        System.out.print("Enter forum description: ");
        String description = scanner.nextLine();
        forumManager.createForum(name, description);
    }

    private static void addPost(User user) {
        System.out.println("Select a forum to add post:");
        List<Forum> forums = forumManager.getForums();
        if (forums.isEmpty()) {
            System.out.println("No forums available to add posts.");
            return;
        }

        for (int i = 0; i < forums.size(); i++) {
            System.out.println((i + 1) + ". " + forums.get(i).getName());
        }

        int forumChoice = Integer.parseInt(scanner.nextLine());
        if (forumChoice < 1 || forumChoice > forums.size()) {
            System.out.println("Invalid forum choice.");
            return;
        }

        Forum selectedForum = forums.get(forumChoice - 1);

        // Select or create a thread within the selected forum
        Thread selectedThread = selectOrCreateThread(selectedForum);

        if (selectedThread == null) {
            System.out.println("Thread selection failed.");
            return;
        }

        System.out.print("Enter post content: ");
        String content = scanner.nextLine();
        Post post = new Post(content, user);
        selectedThread.addPost(post);
        System.out.println("Post created successfully in thread " + selectedThread.getTitle() +
                " of forum " + selectedForum.getName());
    }

    // Helper method to select or create a thread within a forum
    private static Thread selectOrCreateThread(Forum forum) {
        System.out.println("Select a thread or create a new one:");
        List<Thread> threads = forum.getThreads();
        for (int i = 0; i < threads.size(); i++) {
            System.out.println((i + 1) + ". " + threads.get(i).getTitle());
        }
        System.out.println((threads.size() + 1) + ". Create New Thread");

        int threadChoice = Integer.parseInt(scanner.nextLine());
        if (threadChoice >= 1 && threadChoice <= threads.size()) {
            return threads.get(threadChoice - 1);
        } else if (threadChoice == threads.size() + 1) {
            // Create a new thread
            System.out.print("Enter thread title: ");
            String title = scanner.nextLine();
            Thread newThread = forumManager.createThread(forum, title, userManager.getUser("default"));
            if (newThread != null) {
                return newThread;
            } else {
                System.out.println("Failed to create new thread.");
                return null;
            }
        } else {
            System.out.println("Invalid thread choice.");
            return null;
        }
    }

    static class User {
        private String username;
        private String bio;

        public User(String username, String bio) {
            this.username = username;
            this.bio = bio;
        }

        public String getUsername() {
            return username;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            User other = (User) obj;
            return username.equals(other.username);
        }

        @Override
        public int hashCode() {
            return username.hashCode();
        }
    }

    static class UserManager {
        private Map<String, User> users = new HashMap<>();

        public void registerUser(String username, String bio) {
            if (!users.containsKey(username)) {
                users.put(username, new User(username, bio));
                System.out.println("User registered successfully.");
            } else {
                System.out.println("Username already exists. Give a Unique Username ");
            }
        }

        public User getUser(String username) {
            return users.get(username);
        }
    }

    static class Forum {
        private String name;
        private String description;
        private List<Thread> threads = new ArrayList<>();

        public Forum(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public List<Thread> getThreads() {
            return threads;
        }

        public void addThread(Thread thread) {
            threads.add(thread);
        }
    }

    static class Thread {
        private String title;
        private User author;
        private List<Post> posts = new ArrayList<>();

        public Thread(String title, User author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public User getAuthor() {
            return author;
        }

        public List<Post> getPosts() {
            return posts;
        }

        public void addPost(Post post) {
            posts.add(post);
        }
    }

    static class Post {
        private String content;
        private User author;

        public Post(String content, User author) {
            this.content = content;
            this.author = author;
        }

        public String getContent() {
            return content;
        }

        public User getAuthor() {
            return author;
        }
    }

    static class ForumManager {
        private List<Forum> forums = new ArrayList<>();

        public List<Forum> getForums() {
            return forums;
        }

        public void createForum(String name, String description) {
            forums.add(new Forum(name, description));
            System.out.println("Forum created successfully.");
        }

        // Method to create a new thread in a specific forum
        public Thread createThread(Forum forum, String title, User author) {
            Thread thread = new Thread(title, author);
            forum.addThread(thread);
            return thread;
        }
    }
}




