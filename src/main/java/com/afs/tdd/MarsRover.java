package com.afs.tdd;

public class MarsRover {
    private int coordinateX;
    private int coordinateY;
    private char direction;

    public MarsRover(int coordinateX, int coordinateY, char direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public String executeCommand(char command){
        if(command == 'M')
            move();
        else
            turn(command);

        return reportLocationStatus();
    }

    private String reportLocationStatus() {
        return String.format("%d %d %c", coordinateX, coordinateY, direction);
    }

    private void move() {
        switch (direction) {
            case 'N':
                coordinateY++;
                break;
            case 'E':
                coordinateX++;
                break;
            case 'S':
                coordinateY--;
                break;
            case 'W':
                coordinateX--;
                break;
        }
    }

    private void turn(char command) {
        if(command == 'L'){
            switch (direction) {
                case 'N':
                    direction = 'W';
                    break;
                case 'E':
                    direction = 'N';
                    break;
                case 'S':
                    direction = 'E';
                    break;
                case 'W':
                    direction = 'S';
                    break;
            }
        } else if(command == 'R') {
            switch (direction) {
                case 'N':
                    direction = 'E';
                    break;
                case 'E':
                    direction = 'S';
                    break;
                case 'S':
                    direction = 'W';
                    break;
                case 'W':
                    direction = 'N';
                    break;
            }
        }
    }
}
