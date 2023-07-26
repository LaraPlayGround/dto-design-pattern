public class UserDtoTest {

    public static void main(String[] args) {
        // Step 1: Create a user entity
        User user = new User();
        user.setId(1L);
        user.setUsername("john_doe");
        user.setEmail("john.doe@example.com");

        // Step 2: Create UserDTO from User entity
        UserDTO userDTO = new UserDTO(user);

        // Step 3: Verify data in UserDTO
        System.out.println("User ID: " + userDTO.getId()); // Output: User ID: 1
        System.out.println("Username: " + userDTO.getUsername()); // Output: Username: john_doe
        // Add more verification for other attributes as needed for the presentation layer.
    }
}
