public enum Menu {

    INPUT_ORDER("A","Input Order"),
    EXIT("X","Exit The System");


    private final String option;
    private final String content;

    Menu(String option, String content) {
        this.option = option;
        this.content = content;
    }

    public String getOption() {
        return option;
    }

    public String getContent() {
        return content;
    }
}
