
import java.util.*;

class Solution {
    List<Integer>[] adj;
    int[][] up;
    int[] depth, tin, tout, pref;
    int timer, LOG;
    char[] chars;
    Fenwick bit;

    public List<Boolean> palindromePath(
            int n, int[][] edges, String s, String[] queries) {

        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        LOG = 1;
        while ((1 << LOG) <= n) LOG++;

        up = new int[LOG][n];
        depth = new int[n];
        tin = new int[n];
        tout = new int[n];
        pref = new int[n];
        chars = s.toCharArray();

        int[] parent = new int[n];
        int[] iter = new int[n];
        int[] stack = new int[n];

        timer = 0;
        int top = 0;
        stack[0] = 0;
        parent[0] = 0;
        pref[0] = 1 << (chars[0] - 'a');
        tin[0] = timer++;

        while (top >= 0) {
            int u = stack[top];

            if (iter[u] < adj[u].size()) {
                int v = adj[u].get(iter[u]++);

                if (v == parent[u]) continue;

                parent[v] = u;
                depth[v] = depth[u] + 1;
                pref[v] = pref[u] ^ (1 << (chars[v] - 'a'));
                tin[v] = timer++;
                stack[++top] = v;
            } else {
                tout[u] = timer - 1;
                top--;
            }
        }

        for (int i = 0; i < n; i++) {
            up[0][i] = parent[i];
        }

        for (int k = 1; k < LOG; k++) {
            for (int i = 0; i < n; i++) {
                up[k][i] = up[k - 1][up[k - 1][i]];
            }
        }

        bit = new Fenwick(n + 2);
        List<Boolean> ans = new ArrayList<>();

        for (String q : queries) {
            String[] p = q.split(" ");

            if (p[0].equals("update")) {
                int u = Integer.parseInt(p[1]);
                char c = p[2].charAt(0);

                int delta = (1 << (chars[u] - 'a'))
                          ^ (1 << (c - 'a'));

                if (delta != 0) {
                    bit.rangeXor(tin[u], tout[u], delta);
                    chars[u] = c;
                }
            } else {
                int u = Integer.parseInt(p[1]);
                int v = Integer.parseInt(p[2]);
                int w = lca(u, v);

                int pu = pref[u] ^ bit.pointQuery(tin[u]);
                int pv = pref[v] ^ bit.pointQuery(tin[v]);

                int mask = pu ^ pv ^ (1 << (chars[w] - 'a'));

                ans.add((mask & (mask - 1)) == 0);
            }
        }

        return ans;
    }

    int lca(int u, int v) {
        if (depth[u] < depth[v]) {
            int t = u;
            u = v;
            v = t;
        }

        int d = depth[u] - depth[v];

        for (int k = 0; k < LOG; k++) {
            if ((d & (1 << k)) != 0) {
                u = up[k][u];
            }
        }

        if (u == v) return u;

        for (int k = LOG - 1; k >= 0; k--) {
            if (up[k][u] != up[k][v]) {
                u = up[k][u];
                v = up[k][v];
            }
        }

        return up[0][u];
    }

    class Fenwick {
        int[] tree;
        int size;

        Fenwick(int n) {
            size = n;
            tree = new int[n + 1];
        }

        void update(int i, int mask) {
            while (i <= size) {
                tree[i] ^= mask;
                i += i & -i;
            }
        }

        void rangeXor(int l, int r, int mask) {
            update(l + 1, mask);
            update(r + 2, mask);
        }

        int pointQuery(int i) {
            int ans = 0;

            for (int x = i + 1; x > 0; x -= x & -x) {
                ans ^= tree[x];
            }

            return ans;
        }
    }
}
