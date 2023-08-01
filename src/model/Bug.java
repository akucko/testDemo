package model;

public class Bug implements ConsoleNotification, Comparable<Bug> {
    private String description;
    private BugReporter bugReporter;
    private int priority;
    private boolean isOpen;


    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public Bug(String description, BugReporter bugReporter, int priority, boolean isOpen) {
        this.description = description;
        this.bugReporter = bugReporter;
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
        notifyStatusChange();
        isOpen = open;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "description='" + description + '\'' +
                ", bugReporter=" + bugReporter +
                ", priority=" + priority +
                ", isOpen=" + isOpen +
                '}';
    }

    public void showBug() {
        System.out.println("model.Bug: " + this.description + " who: " + this.bugReporter + this.priority + this.isOpen);
    }

    public void showReporter() {
        System.out.println(" who: " + this.bugReporter);
    }

    public void showStatus() {
        System.out.println(" isOpen: " + this.isOpen);
    }

    public int getPriority() {
        return this.priority;
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Status changed");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bug)) return false;

        Bug bug = (Bug) o;

        if (getPriority() != bug.getPriority()) return false;
        if (isOpen() != bug.isOpen()) return false;
        if (getDescription() != null ? !getDescription().equals(bug.getDescription()) : bug.getDescription() != null)
            return false;
        return getBugReporter() != null ? getBugReporter().equals(bug.getBugReporter()) : bug.getBugReporter() == null;
    }

    @Override
    public int hashCode() {
        int result = getDescription() != null ? getDescription().hashCode() : 0;
        result = 31 * result + (getBugReporter() != null ? getBugReporter().hashCode() : 0);
        result = 31 * result + getPriority();
        result = 31 * result + (isOpen() ? 1 : 0);
        return result;
    }

    @Override
    public int compareTo(Bug bug) {
        return this.getDescription().compareTo(bug.getDescription());

    }
}
