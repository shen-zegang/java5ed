
public enum TrafficLight {
    GREEN, RED, YELLOW;
}

void main() {
    TrafficLight[] tl = TrafficLight.values();
    for (TrafficLight light : tl) {
        IO.print(light);
        IO.println("  " + light.ordinal());
    }
    TrafficLight red = TrafficLight.RED;
    switch (red) {
        case RED -> IO.println("RED, stop.");
        case GREEN -> IO.println("GREEN, go.");

        case YELLOW -> IO.println("YELLOW, do not know.");
    }
}

