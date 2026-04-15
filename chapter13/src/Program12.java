void main(String[] args) {
    File fa = new File("a.txt");
    File fb = new File("b.txt");
    try (
            Scanner fra = new Scanner(fa);
            Scanner frb = new Scanner(fb);
            PrintWriter out = new PrintWriter("output.txt");
    ) {
        int a = fra.nextInt();
        int b = frb.nextInt();
        while (fra.hasNext() || frb.hasNext()) {
            if (a <= b) {
                out.print(a + " ");
                IO.println(a);
                if (fra.hasNext()) {
                    a = fra.nextInt();
                } else {
                    out.print(b + " ");
                    IO.println(b);
                    break;
                }

            } else {
                out.print(b + " ");
                IO.println(b);
                if (frb.hasNext()) {
                    b = frb.nextInt();
                } else {
                    out.print(a + " ");
                    IO.println(a);
                    break;
                }
            }
        }

        while (fra.hasNext()) {
            a = fra.nextInt();
            out.print(a + " ");
            IO.println(a);
        }

        while (frb.hasNext()) {
            b = frb.nextInt();
            out.print(b + " ");
            IO.println(b);
        }
    } catch (IOException e) {
        IO.println(e.toString());
    }
    IO.println("文件合并完毕！");
}

