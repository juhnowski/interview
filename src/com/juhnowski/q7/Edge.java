package com.juhnowski.q7;

/**
 * грань
 */
public class Edge {
    enum Type { INNER, OUTER, FLAT }
    Piece parent;
    Type type;
    boolean fitsWith(Edge type) { return true; }; // Inners & outer fit together.
}
