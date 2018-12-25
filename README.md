# java-GraphDraw
Java GraphDraw is a library for drawing graphs in java swing 

Usage:

        JFrame frame = new JFrame();
        //create an object
        GraphDraw draw = new GraphDraw();
        
        //create a node
        Node node = new Node();
        node.setDisplayName("n1");
        node.setColor(Color.BLUE);
        node.setPosition(new Node.Position(100, 200));
        draw.addNode(node);
        
        //create another node
        Node node1 = new Node();
        node1.setDisplayName("n2");
        node1.setColor(Color.GREEN);
        node1.setPosition(new Node.Position(200, 100));
        draw.addNode(node1);
        
        //create an edge
        Edge edge = new Edge(node, node1);
        edge.setFocussed(true);
        edge.setColor(Color.MAGENTA);
        edge.setWeight(2);
        draw.addEdge(edge);
        
        //displaying graph
        draw.setSize(800, 800);
        draw.setVisible(true);
        frame.add(draw);
        frame.setSize(800, 800);
        frame.setVisible(true);

