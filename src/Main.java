void main () {
    String[] list = {"Viktor", "My", "Lilly", "Alexander", "Tony"};
    String longestName = list[0];
    for (String namn : list) {
        if (namn.length() > longestName.length()) {
            longestName = namn;
        }
    }
    IO.println("Det längsta namnet är: " + longestName);
}