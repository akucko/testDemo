package model;

import java.util.Objects;

public class BugReporter {
    private String firstName;
    private String lastName;
    private String email;

    public BugReporter(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setEmail(email);
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("brakuje @");
        }
    }
    @Override
    public String toString() {
        return "BugReporter{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BugReporter that = (BugReporter) o;

        if (!Objects.equals(firstName, that.firstName)) return false;
        if (!Objects.equals(lastName, that.lastName)) return false;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
