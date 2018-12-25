import java.awt.*;

public class Node {
    private boolean automaticName = true;
    private String displayName;

    private Color color = Color.black;

    private Position position;

    public Node() {

    }

    public Node(Position edgePosition) {
        this.position = edgePosition;
    }

    public void setDisplayName(String displayName) {
        automaticName = false;
        this.displayName = displayName;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public boolean isAutomaticName() {
        return automaticName;
    }

    public String getDisplayName() {
        if (isAutomaticName()) {
            displayName = NameUtil.getInstance().getName();
        }
        return displayName;
    }

    public Position getPosition() {
        return position;
    }

    public static class Position {
        int posX;
        int posY;

        public Position() {
            this(0, 0);
        }

        public Position(int posX, int posY) {

            this.posX = posX;
            this.posY = posY;
        }
    }
}
