package BuckLuckDuck.options;

public class Options {
    boolean showVisible = false;
    boolean showClickable = false;
    boolean askForClick = false;
    boolean printDOM = true;
    String navigateLink = "";

    public Options() {
    }

    public boolean isShowVisible() {
        return showVisible;
    }

    public void setShowVisible(boolean showVisible) {
        this.showVisible = showVisible;
    }

    public boolean isShowClickable() {
        return showClickable;
    }

    public void setShowClickable(boolean showClickable) {
        this.showClickable = showClickable;
    }

    public String getNavigateLink() {
        return navigateLink;
    }

    public void setNavigateLink(String navigateLink) {
        this.navigateLink = navigateLink;
    }

    public boolean isAskForClick() {
        return askForClick;
    }

    public void setAskForClick(boolean askForClick) {
        this.askForClick = askForClick;
    }

    public boolean isPrintDOM() {
        return printDOM;
    }

    public void setPrintDOM(boolean printDOM) {
        this.printDOM = printDOM;
    }
}
