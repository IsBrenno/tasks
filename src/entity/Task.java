package entity;

public class Task {
    private String title;
    private Category category;
    private String details;

    public Task(String title, Category category) {
        this.title = title;
        this.category = category;
    }

    public Task(String title, Category category, String details) {
        this.title = title;
        this.category = category;
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return this.category.title;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
