package com.juhnowski.q6;

public class Queen extends ChessPieceBase{
    @Override
    boolean canBeChecked() {
        return false;
    }

    @Override
    boolean isSupportCastle() {
        return false;
    }
}
