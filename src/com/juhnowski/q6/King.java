package com.juhnowski.q6;

public class King extends ChessPieceBase{

    @Override
    boolean canBeChecked() {
        return true;
    }

    @Override
    boolean isSupportCastle() {
        return false;
    }
}
