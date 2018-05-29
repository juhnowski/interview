package com.juhnowski.q7;

import java.util.ArrayList;

public class Puzzle {
    Piece[][] pieces;
    Piece[][] solution;
    Edge[] inners, outers, flats;
    ArrayList<Edge> exposed_edges;

    void sort() {
        /**
         * Итерации по всем краям, добавление каждого из них внутрь, наружу и т.д. если это необходимо.
         * Ищем углы - добавляем их в решение.
         * Добавляем каждый не-плоский край угла в protected_edges.
         */
    }

    void solve() {
        for( Edge edge1: exposed_edges) {

             if (edge1.type == Edge.Type.INNER) {
                for(Edge edge2: outers) {
                     if (edge1.fitsWith(edge2)) {
                         /**
                          * Найдено совпадение
                          */

                    }

                }
                /* Do the same thing, swapping inner & outer. */

            }
        }
    }
}
