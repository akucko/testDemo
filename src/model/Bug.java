package model;

public class Bug {
    private String description;
    private String email;
    private int priority;
    private boolean isOpen;


    public Bug(String description, String email, int priority, boolean isOpen) {
        this.description = description;
        this.email = email;
        this.priority = priority;
        this.isOpen = isOpen;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() < 10) {
            System.out.println("za krótki");
        } else {
            this.description = description;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("brakuje @");
        }
    }

    public void setPriority(int priority) {
        if (priority > 0 && priority < 6) {
            this.priority = priority;
        } else {
            System.out.println("tylko 1-5");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void showBug() {
        System.out.println("model.Bug: " + this.description + " who: " + this.email + this.priority + this.isOpen);
    }

    public void showReporter() {
        System.out.println(" who: " + this.email);
    }

    public void showStatus() {
        System.out.println(" isOpen: " + this.isOpen);
    }

    public int getPriority() {
        return this.priority;
    }

}
