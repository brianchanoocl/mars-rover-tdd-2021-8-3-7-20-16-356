package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {

    @Test
    void should_corrdinateY_change_to_1_when_move_given_command_M_and_direction_N() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, 'N');
        char command = 'M';

        // when
        String result = marsRover.executeCommand(command);

        // return
        assertEquals("0 0 N", result);
    }
    @Test
    void should_direction_change_to__() {

    }
}
