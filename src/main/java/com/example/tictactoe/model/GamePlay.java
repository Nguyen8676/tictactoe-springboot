package com.example.tictactoe.model;

import lombok.Data;

@Data
public class GamePlay {
    private TicToe type;
    private Integer cordinateX;
    private Integer cordinateY;
    private String gameId;

}
