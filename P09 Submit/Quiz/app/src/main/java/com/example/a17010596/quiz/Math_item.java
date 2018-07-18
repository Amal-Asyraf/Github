package com.example.a17010596.quiz;

public class Math_item {
    private String title;
    private String formula;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Math_item(String title, String formula, String description) {
        this.title = title;
        this.formula = formula;
        this.description=description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "title='" + title + '\'' +
                ", formula='" + formula + '\'' +
                '}';
    }
}

