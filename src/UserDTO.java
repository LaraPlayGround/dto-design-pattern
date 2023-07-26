public class UserDTO {
    private Long id;
    private String username;
    // Other user attributes needed by the presentation layer.

    // Constructor to convert User entity to UserDTO.
    public UserDTO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        // Set other attributes as needed for the presentation layer.
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

// Getters and setters for UserDTO attributes.
    // Note that setters may not always be necessary if DTOs are used for read-only purposes.
}

