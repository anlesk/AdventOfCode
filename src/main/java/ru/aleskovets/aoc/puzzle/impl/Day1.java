package ru.aleskovets.aoc.puzzle.impl;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import java.io.InputStream;

@Component
public class Day1 extends PuzzleImpl {

    public void run(InputStream inputStream) throws Exception {
        String input = IOUtils.toString(inputStream, "UTF-8");
        int result = 0;
        for(int i=0; i < input.length(); i++) {
            if (input.charAt(i) == '(' ) {
                result++;
            } else if (input.charAt(i) == ')' ) {
                result--;
            }
        }
        logger.info("Result: " + result);
    }
}