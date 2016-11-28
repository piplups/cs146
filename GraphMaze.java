package sjsu.Nguyen.cs146.project3;

//import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Philip on 11/27/2016.
 */
public class GraphMaze {
    /******* Properties *******/
    private int size; //the maze's size(which will be square)
    private Vertex[] vertList; //list of vertices
    private List[] adjList; //The way to recognize edges
    private Random rng; //Random Number Generator

    /******* Vertex Class *******/
    private class Vertex{
        public char label;

        public Vertex(char l){
            label = l;
        }
    }//end vertex class

    /******* GraphMaze Constructor *******/
    public GraphMaze(int newSize){
        size = newSize;
        adjList = new List[size];
        vertList = new Vertex[size];
    }//end constructor

    double myRandom(){
        return rng.nextDouble(); //number between 0 and 1
    }


}
