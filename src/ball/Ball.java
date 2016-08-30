package ball;

import ball.model.Behaviour;

import java.awt.*;
import java.util.*;
import java.util.List;

// DO NOT CHANGE (but you can add methods)
public interface Ball {
    int DEFAULT_RADIUS = 50;

    int radius();
    Point center();
    void update();
}
