package primary;

import primary.momento.Editor;

public class Main {
    public static void main(String[] args) {
      var editor = new Editor();
      editor.setContent("a");
      editor.setContent("b");
      editor.setContent("c");
      editor.undo();
    }


}