class Solution {
    public String maxValue(String n, int x) {
     
    //     List<Integer> list = new LinkedList<>();
    //     boolean z = false;
    //     String s = "";
    //  if (n.charAt(0) == '-') {
    //         z = true;
    //  }
    //     if (z==true) {
    //         s += "-";
    //         boolean f = false;

    //         for (int u = 1; u < n.length(); u++) {
    //             if (!f && (n.charAt(u) - '0') > x) {
    //                 s += x;
    //                 f = true;
    //             }
    //             s += n.charAt(u);
    //         }

    //         if (!f) s += x;

    //     } else {

    //         boolean f = false;

    //         for (int u = 0; u < n.length(); u++) {
    //             if (!f && (n.charAt(u) - '0') < x) {
    //                 s += x;
    //                 f = true;
    //             }
    //             s += n.charAt(u);
    //         }

    //         if (!f) s += x;
    //     }

    //     return s;
    boolean z = false;
        StringBuilder s = new StringBuilder();

        if (n.charAt(0) == '-') {
            z = true;
        }

        if (z) {
            s.append('-');
            boolean f = false;

            for (int u = 1; u < n.length(); u++) {
                if (!f && (n.charAt(u) - '0') > x) {
                    s.append(x);
                    f = true;
                }
                s.append(n.charAt(u));
            }

            if (!f) s.append(x);

        } else {

            boolean f = false;

            for (int u = 0; u < n.length(); u++) {
                if (!f && (n.charAt(u) - '0') < x) {
                    s.append(x);
                    f = true;
                }
                s.append(n.charAt(u));
            }

            if (!f) s.append(x);
        }

        return s.toString();
    }
}