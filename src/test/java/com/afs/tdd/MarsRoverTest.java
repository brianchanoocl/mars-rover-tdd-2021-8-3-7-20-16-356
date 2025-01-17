package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    void should_coordinateY_change_to_1_when_move_given_command_M_and_direction_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        char command = 'M';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("0 1 N", result);
    }

    @Test
    void should_coordinateX_change_to_1_when_move_given_command_M_and_direction_E() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'E');
        char command = 'M';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("1 0 E", result);
    }

    @Test
    void should_coordinateY_change_to_minus_1_when_move_given_command_M_and_direction_S() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'S');
        char command = 'M';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("0 -1 S", result);
    }

    @Test
    void should_coordinateX_change_to_minus_1_when_move_given_command_M_and_direction_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'W');
        char command = 'M';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("-1 0 W", result);
    }

    @Test
    void should_direction_change_to_W_when_turn_given_command_L_and_direction_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        char command = 'L';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("0 0 W", result);
    }

    @Test
    void should_direction_change_to_N_when_turn_given_command_L_and_direction_E() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'E');
        char command = 'L';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("0 0 N", result);
    }

    @Test
    void should_direction_change_to_E_when_turn_given_command_L_and_direction_S() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'S');
        char command = 'L';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("0 0 E", result);
    }

    @Test
    void should_direction_change_to_S_when_turn_given_command_L_and_direction_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'W');
        char command = 'L';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("0 0 S", result);
    }

    @Test
    void should_direction_change_to_E_when_turn_given_command_R_and_direction_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        char command = 'R';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("0 0 E", result);
    }

    @Test
    void should_direction_change_to_S_when_turn_given_command_R_and_direction_E() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'E');
        char command = 'R';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("0 0 S", result);
    }

    @Test
    void should_direction_change_to_W_when_turn_given_command_R_and_direction_S() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'S');
        char command = 'R';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("0 0 W", result);
    }

    @Test
    void should_direction_change_to_N_when_turn_given_command_R_and_direction_W() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'W');
        char command = 'R';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("0 0 N", result);
    }

    @Test
    void should_direction_change_to_N_and_coordinateX_change_to_1_and_coordinateY_change_to_1_when_move_and_turn_given_command_LMRM_and_direction_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        String commands = "LMRM";

        // when
        String result = marsRover.executeCommand(commands);

        // return
        assertEquals("-1 1 N", result);
    }
}
