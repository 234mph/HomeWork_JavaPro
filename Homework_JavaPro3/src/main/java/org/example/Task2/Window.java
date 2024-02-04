package org.example.Task2;
public class Window {

    private int windowCount;
    private String windowColor;

    public Window(int numOfWindows, String windowColor) {
        this.windowCount = numOfWindows;
        this.windowColor = windowColor;
    }

    public int getWindowCount() {
        return windowCount;
    }

    public void setWindowCount(int windowCount) {
        this.windowCount = windowCount;
    }

    public String getWindowColor() {
        return windowColor;
    }

    public void setWindowColor(String windowColor) {
        this.windowColor = windowColor;
    }
}
