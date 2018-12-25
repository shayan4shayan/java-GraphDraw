import java.awt.*;

public class Edge {
    private Node.Position startPosition;
    private Node.Position endPosition;
    private int weight;
    private boolean isWeighted = false;
    private Color color = Color.black;

    private boolean focussed = false;

    private String name1;
    private String name2;

    public Edge(Node node1, Node node2) {
        this(node1, node2, 0);
    }

    public Edge(Node node1, Node node2, int weight) {
        startPosition = node1.getPosition();
        endPosition = node2.getPosition();
        name1 = node1.getDisplayName();
        name2 = node2.getDisplayName();

        this.weight = weight;
        isWeighted = weight > 0;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public Node.Position getEndPosition() {
        return endPosition;
    }

    public Node.Position getStartPosition() {
        return startPosition;
    }

    public boolean isFocussed() {
        return focussed;
    }

    public boolean isWeighted() {
        return isWeighted;
    }

    public void setFocussed(boolean focussed) {
        this.focussed = focussed;
    }

    public void setEndPosition(Node endPosition) {
        this.endPosition = endPosition.getPosition();
    }

    public void setStartPosition(Node startPosition) {
        this.startPosition = startPosition.getPosition();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Node.Position getCenterPosition() {
        Node.Position position = new Node.Position();
        position.posX = (startPosition.posX + endPosition.posX) / 2;
        position.posY = (startPosition.posY + endPosition.posY) / 2;
        return position;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        isWeighted = weight > 0;
    }

    public float getSlope() {
        float deltaX = startPosition.posX - endPosition.posX;
        float deltaY = startPosition.posY - endPosition.posY;
        return deltaY / deltaX;
    }

    public String getStartName() {
        return name1;
    }

    public String getEndName() {
        return name2;
    }
}
