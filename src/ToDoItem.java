public class ToDoItem {
    private String description;
    private boolean isDone;

    public ToDoItem(String description) {
        isDone = false;
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public String getDescription() {
        return description;
    }

    public void GetIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public void GetDescription(String description) {
        this.description = description;
    }
}
