package com.sanyi.interactivestory.model;

public class Choice {
    private int tesxtId;
    private int nextPage;

    public Choice(int tesxtId, int nextPage) {
        this.tesxtId = tesxtId;
        this.nextPage = nextPage;
    }

    public int getTesxtId() {
        return tesxtId;
    }

    public void setTesxtId(int tesxtId) {
        this.tesxtId = tesxtId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
