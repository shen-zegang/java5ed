public static int solveQuadratic(double[] eqn, double[] roots) {
    double discriminant;
    discriminant = eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];
    if (discriminant < 0) {
        return 0;
    } else if (discriminant == 0) {
        roots[0] = -eqn[1] / (2 * eqn[0]);
        roots[1] = -eqn[1] / (2 * eqn[0]);
        return 1;
    } else {
        roots[0] = (-eqn[1] + Math.sqrt(discriminant)) / (2 * eqn[0]);
        roots[1] = (-eqn[1] - Math.sqrt(discriminant)) / (2 * eqn[0]);
        return 2;
    }
}
void main() {
    // TODO Auto-generated method stub
}

