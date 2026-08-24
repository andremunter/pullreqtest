void main () {
    String[] list = {"Viktor", "My", "Lilly", "Alexander", "Tony"};
    String longestName = list[0];
    for (int i = 0; i < list.length ; i++){
        if (list[i].length() > longestName.length())
            longestName = list[i];
        }
    IO.println("Det längsta namnet är: " + longestName);
    }
